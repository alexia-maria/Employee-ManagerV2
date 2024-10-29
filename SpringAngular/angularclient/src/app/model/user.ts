export class User {
  id: string;
  name: string;
  email: string;

  constructor(userData: { id?: string; name?: string; email?: string } = {}) {
    this.id = userData.id || '';
    this.name = userData.name || '';
    this.email = userData.email || '';
  }
}
