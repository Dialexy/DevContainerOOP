## Imeplementation Requirements

A. Singleton Rules

    The constructor must be private.

    The class must expose a single static method:

        Java

        public static MarsSirenController getInstance()

        This method must return the same instance of the class every time it is called.

    Attempting to create another instance of the class (via a constructor) must throw:
    Java

    new IllegalStateException("Use getInstance() to access the singleton instance")

    Note: This is achieved using a private construtor
    Java

    if (instance != null) {
        throw new IllegalStateException("Use getInstance() to access the singleton instance");
    }

B. Fields

All fields must be private:
Field 	Type 	Description
armed 	boolean 	Indicates whether the siren system is armed.
sounding 	boolean 	Indicates whether the siren is currently sounding.
volume 	int 	Current siren volume level (0–100 dB).
C. Behaviours
Method 	Return Type 	Description
public boolean arm() 	boolean 	Arms the siren system if not already armed. Returns true if state changed.
public boolean disarm() 	boolean 	Disarms the system if armed and ensures the siren stops. Returns true if state changed.
public boolean isArmed() 	boolean 	Returns whether the system is currently armed.
public void setVolume(int db) 	void 	Sets the siren volume. Must be between 0–100 inclusive, otherwise throw IllegalArgumentException.
public int getVolume() 	int 	Returns the current siren volume.
public void sound() 	void 	Activates the siren only when armed, otherwise throws IllegalStateException.
public void stop() 	void 	Silences the siren.
public boolean isSounding() 	boolean 	Returns whether the siren is currently sounding.
D. Encapsulation Rules

    All fields must be declared private.
    No public setters for armed or sounding.
    No additional constructors allowed.

Example Behaviour

Below is an example of how this singleton should behave
Java

MarsSirenController c = MarsSirenController.getInstance();

c.arm();
c.setVolume(75);
c.sound();

System.out.println(c.isSounding());  // true

c.stop();
System.out.println(c.isSounding());  // false

c.disarm();
System.out.println(c.isArmed());     // false

What Will Be Checked

Your solution aims to demonstrates clear understanding of:

        The Singleton design pattern
        Encapsulation principles
        Controlled state management
        Proper use of exceptions

Singleton Design Rules

    The class must have a private constructor.
    The constructor must prevent reflection from creating another instance (throwing IllegalStateException).
    getInstance() must always return the same object.
    The instance must be created lazily (only when first accessed).
    There must be no additional constructors.
    The class must be declared final to prevent subclassing.

Encapsulation

    All instance fields (armed, sounding, volume) must be private.
    No public setters for internal state (armed or sounding).
    setVolume(int db) must enforce a valid range of 0–100.
    IllegalArgumentException must be thrown for invalid volume values.
    volume must be retrievable through getVolume() only.

Behavioural Functionality

    arm() must arm the system if not already armed and return true when the state changes.
    disarm() must disarm the system and stop the siren; return true when state changes.
    isArmed() must correctly reflect the system’s current armed state.
    sound() must activate the siren only when armed; otherwise raise IllegalStateException.
    stop() must silence the siren regardless of state.
    isSounding() must correctly report whether the siren is active.
    setVolume(int db) must accept only values 0–100 inclusive.
    getVolume() must return the correct current volume.

Coding Style and Structure

    The class name must be exactly MarsSirenController.
    The package must be exactly com.ehu.
    The class must be declared final.
    Method names and signatures must match the specification exactly (case-sensitive).
    The only static field permitted is the singleton instance.
    No additional classes or files should be introduced.
    The implementation must compile successfully within the Maven project structure.


