# Feature to add a message label and field in the portal.

## Overview

Add below the H1 header a new message field with a label set to "Message Received : " and a message placeholder.
The default message placeholder is set to "Waiting for action".
When the Hello or GetDate button is called the result of this will be show as message in the message field.

## Solution

At the top of the page is the H1 header with text "Welcome to WebPortal".
Add below this header the meeesge label and field.
Below this message label and field should be the button list : Home, message field, Hello button and GetDate button dame order as used in current implementation.

## Use as reference 

Use as reference of what the WebPortal is all about @/context/features/webportal-add-new-vaadin-portal.md

## Changes Required

- Add the message label and field in the .\SpringWeb\WebPortal\src\main\java\com\example\webportal\MainView.java portal landingspage.
- Do not change any of the other components.