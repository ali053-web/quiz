export interface User {
  id?: number;         // Correspond au type Long en Java
  username: string;
  prenom: string;
  email: string;
  password: string;
  role: string;
}

