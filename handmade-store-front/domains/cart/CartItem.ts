export default class CartItem {
  constructor(
    public id: string = '',
    public name: string = '',
    public amount: number = 0,
    public images: string = '',
    public quantity: number = 0
  ) {}
}
