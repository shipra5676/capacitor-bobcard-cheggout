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

  async launchSDK(options: { virtualId: string, sessionId: string, payload: string }): Promise<{ message: string }> {
    console.log('launchSDK', options);
    return { message: 'success' };
  }
}
