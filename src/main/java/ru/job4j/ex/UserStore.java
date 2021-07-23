package ru.job4j.ex;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User user = null;
        for (int i = 0; i < users.length; i++) {
            if (users[i].getUsername().equals(login)) {
                user = users[i];
                break;
            }
            if (user == null) {
                    throw new UserInvalidException("User not found");
            }
        }
        return user;
    }

    public static boolean validate(User user) throws UserInvalidException {
        boolean valid = true;
        if (!user.isValid() || user.getUsername().length() < 3) {
            throw new UserInvalidException("User is not valid");
        }
        return valid;
    }

    public static void main(String[] args) {
        try {
        User[] users = {
                new User("Petr Arsentev", true)
        };

            User user = findUser(users, "Petr Arsentev");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        }   catch (UserNotFoundException eun) {
            eun.printStackTrace();
        }
    }
}
