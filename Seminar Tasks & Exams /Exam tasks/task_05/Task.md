# Observer Design Pattern: Reactor Monitoring System

This specification defines the exact requirements that this project must satisfy to pass the provided tests. Read the instructions carefully before beginning.

## Scenario: Ares IV Planetary Reactor Monitoring System

![Ares IV Reactor](https://raw.githubusercontent.com/Edge-Hill-University-Web/Module-Resources/refs/heads/main/CIS2702/task_05_logo.png)

You are tasked with implementing a critical monitoring system for the Ares IV Planetary Reactor Core using the **Observer Design Pattern**. The core function is to ensure that when the reactor's core temperature changes (Subject state change), all independent, registered monitoring systems (Observers) are instantly, automatically, and reliably updated.

## Requirements

You must implement the following Java components, ensuring the method logic strictly adheres to the conditions outlined below:

### Class Diagram

![Class Diagram](https://raw.githubusercontent.com/Edge-Hill-University-Web/Module-Resources/refs/heads/main/CIS2702/task_05_class_diagram.png)

### 1. The Observer Contract (ReactorObserver)

| Component | Type | Method | Conditional Logic & Constraints |
|-----------|------|--------|--------------------------------|
| ReactorObserver | Interface | `update(double temperature)` | **Constraint:** This method must accept a double and return void. It serves purely as the notification receiver. |

### 2. The Subject: ReactorCore (Observable)

| Component | Type | Method | Conditional Logic & Constraints |
|-----------|------|--------|--------------------------------|
| ReactorCore | Class | `attach(ReactorObserver observer)` | **Condition 1 (Null Check):** The observer passed to the method must not be null.<br><br>**Condition 2 (Prevent Duplicates):** An observer must only be added if it is not already present in the internal list of observers. |
| | | `detach(ReactorObserver observer)` | **Constraint:** The method must remove the specified observer from the internal list. |
| | | `setTemperature(double newTemp)` | **Condition 1 (Internal Update):** The method must update the private temperature field before notifying.<br><br>**Condition 2 (Notification Trigger):** Immediately after the temperature update, the method must call the internal notification mechanism (e.g., `notifyObservers()`) to trigger the update on all attached observers. |
| | | `notifyObservers()` (Internal) | **Constraint:** This method must iterate over every observer in the list and call its `update(temperature)` method, passing the current state (`this.temperature`). |

### 3. The Concrete Observers (Monitoring Systems)

| Component | Type | Method | Conditional Logic & Constraints |
|-----------|------|--------|--------------------------------|
| TemperatureDisplay | Class | `update(double temperature)` | **Condition 1 (State Storage):** The method must immediately store the incoming temperature value in the private `lastRecordedTemperature` field.<br><br>**Constraint (Output):** Must print a message to standard output (`System.out`).<br><br>**Test Hook:** Must provide a public getter: `double getLastRecordedTemperature()`. |
| SafetyProtocol | Class | `update(double temperature)` | **Condition 1 (Activation Logic):** Check if temperature ≥ 500.0 K. If true, set `isAlarmActive` to true.<br><br>**Condition 2 (Deactivation Logic):** Check if temperature < 500.0 K. If true, set `isAlarmActive` to false.<br><br>**Constraint (Output on Activation):** A critical message must be printed to `System.err` only when the alarm is activated or remains active above the threshold.<br><br>**Constraint (Output on Deactivation):** A message should be printed to `System.out` when the alarm state transitions from active to inactive.<br><br>**Test Hook:** Must provide a public getter: `boolean isAlarmActive()`. |

## What Will Be Checked

The challenge will be evaluated strictly against the specification and the correct implementation of the Observer Design Pattern. The provided JUnit 5 tests are designed to explicitly check three key areas:

### 1. Structural Adherence

**Pattern Integrity:** This ensures the student has built the core framework of the pattern correctly.

- **Subject API:** Checks if the `ReactorCore` class exposes the necessary public methods: `attach(ReactorObserver)` and `detach(ReactorObserver)`.
- **Observer Contract:** Checks if the `TemperatureDisplay` and `SafetyProtocol` classes correctly implement the `ReactorObserver` interface and its required `update()` method.

### 2. Behavioral Correctness

**Notification Logic:** This verifies that the mechanism for propagating state changes works perfectly, as defined by the pattern.

- **Notification Trigger:** Checks that every time `ReactorCore.setTemperature()` is called, the `update()` method is triggered on all registered observers.
- **Fan-Out Check:** Verifies that multiple attached observers are all notified simultaneously with the current temperature value.
- **Detachment Enforcement:** Checks that an observer that has been explicitly removed (detached) no longer receives updates when the subject's state changes. This is critical proof that the pattern is fully implemented.

### 3. Specification Compliance

**Method Logic & Constraints:** This verifies that the specific business logic for the reactor scenario is met, as detailed in the conditionals.

- **Observer State Storage:** Checks if `TemperatureDisplay` correctly records the last received temperature value via its getter.
- **Safety Protocol Logic:** Checks that the `SafetyProtocol.isAlarmActive()` flag toggles correctly: it must be true exactly when the temperature is ≥ 500.0 K, and false otherwise.
- **Attachment Conditions:** Checks that the `attach` method prevents duplicate observers and handles null inputs (as specified in the detailed requirements).
