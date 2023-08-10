# Click Counter App

## Overview

This is a simple Android application that displays a counter on the main screen in a TextView. The counter's initial value is set to 0, and each time the TextView receives clicks, the counter is incremented. The unique feature of this app is that even if the user rotates the screen, the counter value remains intact.

### Features

- Interactive counter displayed using a TextView.
- Increment of the counter upon TextView clicks.
- Persistent counter value even when the screen is rotated.

### Technology Stack

- Programming Language: [Java]
- Platform: [Android]
- Integrated Development Environment (IDE): [Android Studio]

## Screenshots

![Main Screen Portrait](screenshots/main_screen_portrait.png)
![Main Screen Landscape](screenshots/main_screen_landscape.png)

## Usage

1. Clone this repository: `git clone https://github.com/your-username/click-counter-app.git`
2. Open the project in Android Studio.
3. Run the application on an Android emulator or device.
4. Click on the TextView to increment the counter.
5. Rotate the screen to observe the persistent counter value.

## Implementation Details

The persistent counter value is maintained using the Android lifecycle methods and saving instance state. This ensures that even when the screen orientation changes, the counter value is not lost.

## Contributions

Contributions are welcome! If you have any suggestions, encounter issues, or want to improve the app, feel free to open an issue or submit a pull request.

Feel free to fork and modify the project as needed.
