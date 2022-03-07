export default class Item {
  constructor(
    public id: string = '',
    public itemCategory: string = '',
    public name: string = '',
    public amount: number = 0,
    public images: string = ''
  ) {}
}
