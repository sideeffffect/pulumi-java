// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.secretmanager;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SecretVersionArgs extends com.pulumi.resources.ResourceArgs {

    public static final SecretVersionArgs Empty = new SecretVersionArgs();

    /**
     * The current state of the SecretVersion.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * Secret Manager secret resource
     * 
     */
    @Import(name="secret", required=true)
    private Output<String> secret;

    public Output<String> secret() {
        return this.secret;
    }

    /**
     * The secret data. Must be no larger than 64KiB.
     * **Note**: This property is sensitive and will not be displayed in the plan.
     * 
     */
    @Import(name="secretData", required=true)
    private Output<String> secretData;

    public Output<String> secretData() {
        return this.secretData;
    }

    private SecretVersionArgs() {}

    private SecretVersionArgs(SecretVersionArgs $) {
        this.enabled = $.enabled;
        this.secret = $.secret;
        this.secretData = $.secretData;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SecretVersionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SecretVersionArgs $;

        public Builder() {
            $ = new SecretVersionArgs();
        }

        public Builder(SecretVersionArgs defaults) {
            $ = new SecretVersionArgs(Objects.requireNonNull(defaults));
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public Builder secret(Output<String> secret) {
            $.secret = secret;
            return this;
        }

        public Builder secret(String secret) {
            return secret(Output.of(secret));
        }

        public Builder secretData(Output<String> secretData) {
            $.secretData = secretData;
            return this;
        }

        public Builder secretData(String secretData) {
            return secretData(Output.of(secretData));
        }

        public SecretVersionArgs build() {
            $.secret = Objects.requireNonNull($.secret, "expected parameter 'secret' to be non-null");
            $.secretData = Objects.requireNonNull($.secretData, "expected parameter 'secretData' to be non-null");
            return $;
        }
    }

}
