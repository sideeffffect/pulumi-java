// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudbuild.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TriggerWebhookConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final TriggerWebhookConfigGetArgs Empty = new TriggerWebhookConfigGetArgs();

    /**
     * Secrets to decrypt using Cloud Key Management Service.
     * Structure is documented below.
     * 
     */
    @InputImport(name="secret", required=true)
      private final Input<String> secret;

    public Input<String> getSecret() {
        return this.secret;
    }

    /**
     * - 
     * Potential issues with the underlying Pub/Sub subscription configuration.
     * Only populated on get requests.
     * 
     */
    @InputImport(name="state")
      private final @Nullable Input<String> state;

    public Input<String> getState() {
        return this.state == null ? Input.empty() : this.state;
    }

    public TriggerWebhookConfigGetArgs(
        Input<String> secret,
        @Nullable Input<String> state) {
        this.secret = Objects.requireNonNull(secret, "expected parameter 'secret' to be non-null");
        this.state = state;
    }

    private TriggerWebhookConfigGetArgs() {
        this.secret = Input.empty();
        this.state = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TriggerWebhookConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> secret;
        private @Nullable Input<String> state;

        public Builder() {
    	      // Empty
        }

        public Builder(TriggerWebhookConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.secret = defaults.secret;
    	      this.state = defaults.state;
        }

        public Builder secret(Input<String> secret) {
            this.secret = Objects.requireNonNull(secret);
            return this;
        }

        public Builder secret(String secret) {
            this.secret = Input.of(Objects.requireNonNull(secret));
            return this;
        }

        public Builder state(@Nullable Input<String> state) {
            this.state = state;
            return this;
        }

        public Builder state(@Nullable String state) {
            this.state = Input.ofNullable(state);
            return this;
        }
        public TriggerWebhookConfigGetArgs build() {
            return new TriggerWebhookConfigGetArgs(secret, state);
        }
    }
}
