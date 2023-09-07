import { registerPlugin } from '@capacitor/core';

import type { BobcardCheggoutPlugin } from './definitions';

const BobcardCheggout = registerPlugin<BobcardCheggoutPlugin>(
  'BobcardCheggout',
  {
    web: () => import('./web').then(m => new m.BobcardCheggoutWeb()),
  },
);

export * from './definitions';
export { BobcardCheggout };
