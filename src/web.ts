import { WebPlugin } from '@capacitor/core';

import type { BobcardCheggoutPlugin } from './definitions';

export class BobcardCheggoutWeb
  extends WebPlugin
  implements BobcardCheggoutPlugin
{
  async echo(options: { value: string }): Promise<{ value: string }> {
    console.log('ECHO', options);
    return options;
  }
}
