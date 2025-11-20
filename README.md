# Dev Container for OOP (Java)

## Stability Changes:

### Updated Files:
- **`.vscode/settings.json`**: Adjusted terminal settings for better compatibility with Bash.
- **`prepare.sh`**: Enhanced to validate Java and Maven installations, set `JAVA_HOME`, preload Maven dependencies, and confirm environment readiness.
- **`.devcontainer/devcontainer.json`**: Added mounts for Maven cache, improved environment variable management, and ensured compatibility with Java development.
- **`.devcontainer/Dockerfile`**: Added a health check to verify Java installation and functionality.

### Key Improvements:
1. **Environment Validation**:
   - Ensures Java and Maven are installed and accessible.
2. **Performance Enhancements**:
   - Preloads Maven dependencies to speed up builds.
3. **Health Check**:
   - Verifies Java installation to ensure container stability.
