# Contributing to testing-agent

Thank you for your interest in contributing to this project! We welcome contributions from everyone.

## Getting Started

### Prerequisites

- Java 17 or higher
- Maven 3.8+
- Git
- Your favorite IDE (IntelliJ IDEA, Eclipse, VS Code)

### Development Setup

1. Fork the repository
2. Clone your fork:
   ```bash
   git clone https://github.com/YOUR_USERNAME/testing-agent.git
   cd testing-agent
   ```
3. Create a feature branch:
   ```bash
   git checkout -b feature/your-feature-name
   ```

## Branching Strategy

We follow a git-based-workflow:

- **main**: Production-ready code
- **dev**: Development integration branch
- **feature/***: Feature development branches

### Branch Naming Convention

- `feature/feature-description` - New features
- `bugfix/bug-description` - Bug fixes
- `hotfix/critical-fix` - Critical production fixes

## Development Guidelines

### Code Style

- Follow Java coding conventions
- Use meaningful variable and method names
- Write clear comments for complex logic
- Maintain consistent indentation (4 spaces)

### Testing

- Write unit tests for new features
- Ensure all tests pass before submitting
- Aim for good test coverage

### Commits

- Use conventional commit messages:
  - `feat:` - New features
  - `fix:` - Bug fixes
  - `docs:` - Documentation changes
  - `test:` - Test additions/modifications
  - `chore:` - Maintenance tasks

## Submitting Changes

1. Ensure your code follows the project standards
2. Run tests: `mvn test`
3. Commit your changes with a descriptive message
4. Push to your fork
5. Create a Pull Request

### Pull Request Guidelines

- Provide a clear description of changes
- Reference any related issues
- Ensure CI checks pass
- Request review from maintainers

## Code Review Process

1. All submissions require review
2. Maintainers will provide feedback
3. Address any requested changes
4. Once approved, changes will be merged

## Questions?

If you have questions, please:

1. Check existing issues
2. Create a new issue with the "question" label
3. Contact maintainers

Thank you for contributing!