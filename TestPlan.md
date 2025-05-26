# Test Plan: Admin Login Test - Proxyify

## Objective:
Verify that a valid admin user can log in successfully and is redirected to the dashboard.

## Scope:
- Functional testing of the login page.
- URL redirection validation post-login.

## Test Scenario:
- Navigate to: `https://proxyify.gg/admin`
- Enter email and password.
- Click Login.
- Verify dashboard URL.

## Test Case:

| ID    | Title              | Steps                                                                 | Expected Result                             |
|-------|--------------------|-----------------------------------------------------------------------|---------------------------------------------|
| TC001 | Admin Login        | 1. Navigate to login<br>2. Enter `admin@gmail.com` and `7Ersasf1239n`<br>3. Click login | Redirected to dashboard with correct URL    |

## Assumptions:
- Admin credentials are correct and active.
- Site is live and accessible.
