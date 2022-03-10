// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.apigateway;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AccountArgs extends io.pulumi.resources.ResourceArgs {

    public static final AccountArgs Empty = new AccountArgs();

    /**
     * The Amazon Resource Name (ARN) of an IAM role that has write access to CloudWatch Logs in your account.
     * 
     */
    @InputImport(name="cloudWatchRoleArn")
      private final @Nullable Input<String> cloudWatchRoleArn;

    public Input<String> getCloudWatchRoleArn() {
        return this.cloudWatchRoleArn == null ? Input.empty() : this.cloudWatchRoleArn;
    }

    public AccountArgs(@Nullable Input<String> cloudWatchRoleArn) {
        this.cloudWatchRoleArn = cloudWatchRoleArn;
    }

    private AccountArgs() {
        this.cloudWatchRoleArn = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccountArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> cloudWatchRoleArn;

        public Builder() {
    	      // Empty
        }

        public Builder(AccountArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudWatchRoleArn = defaults.cloudWatchRoleArn;
        }

        public Builder cloudWatchRoleArn(@Nullable Input<String> cloudWatchRoleArn) {
            this.cloudWatchRoleArn = cloudWatchRoleArn;
            return this;
        }

        public Builder cloudWatchRoleArn(@Nullable String cloudWatchRoleArn) {
            this.cloudWatchRoleArn = Input.ofNullable(cloudWatchRoleArn);
            return this;
        }
        public AccountArgs build() {
            return new AccountArgs(cloudWatchRoleArn);
        }
    }
}
