import { Timswierad.ComPage } from './app.po';

describe('timswierad.com App', () => {
  let page: Timswierad.ComPage;

  beforeEach(() => {
    page = new Timswierad.ComPage();
  });

  it('should display message saying app works', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('app works!');
  });
});
