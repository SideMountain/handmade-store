export default class Item {
  constructor(
    public id: string = '',
    public categoryId: string = '',
    public name: string = '',
    public amount: number = 0,
    public images: string = ''
  ) {}
}
