export interface BobcardCheggoutPlugin {
  echo(options: {
      value: string;
  }): Promise<{
      value: string;
  }>;
  launchSDK(options: {
      virtualId: string,
      sessionId: string,
      payload: string,
  }): Promise<{
      message: string;
  }>;
}
