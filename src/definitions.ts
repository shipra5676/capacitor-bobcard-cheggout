export interface BobcardCheggoutPlugin {
  echo(options: { value: string }): Promise<{ value: string }>;
}
