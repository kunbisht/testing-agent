# Security Policy

## Supported Versions

We release patches for security vulnerabilities. Which versions are eligible for receiving such patches depends on the CVSS v3.0 Rating:

| Version | Supported          |
| ------- | ------------------ |
| 1.x.x   | :white_check_mark: |

## Reporting a Vulnerability

If you discover a security vulnerability, please follow these steps:

### 1. Do Not Disclose Publicly

Please do not report security vulnerabilities through public GitHub issues, discussions, or pull requests.

### 2. Report Privately

Instead, please report vulnerabilities by:

- Sending an email to [security@example.com]
- Using GitHub's private vulnerability reporting feature
- Contacting maintainers directly

### 3. Include Details

Please include as much information as possible:

- Type of issue (e.g., buffer overflow, SQL injection, cross-site scripting)
- Full paths of source file(s) related to the manifestation of the issue
- The location of the affected source code (tag/branch/commit or direct URL)
- Any special configuration required to reproduce the issue
- Step-by-step instructions to reproduce the issue
- Proof-of-concept or exploit code (if possible)
- Impact of the issue, including how an attacker might exploit it

### 4. Response Timeline

We will acknowledge receipt of your vulnerability report within 48 hours and will send you regular updates about our progress.

### 5. Disclosure Policy

- We will investigate and validate the security issue
- We will work on a fix and prepare a security advisory
- We will coordinate the release of the fix
- We will publicly disclose the vulnerability after a fix is available

## Security Best Practices

When contributing to this project:

- Keep dependencies up to date
- Follow secure coding practices
- Validate all inputs
- Use parameterized queries for database operations
- Implement proper authentication and authorization
- Log security events appropriately
- Handle sensitive data carefully

## Security Updates

Security updates will be released as patch versions and announced through:

- GitHub Security Advisories
- Release notes
- Project documentation

Thank you for helping keep our project secure!