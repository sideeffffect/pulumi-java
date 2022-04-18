// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.container.inputs.GetClusterNotificationConfigPubsub;
import java.util.List;
import java.util.Objects;


public final class GetClusterNotificationConfig extends com.pulumi.resources.InvokeArgs {

    public static final GetClusterNotificationConfig Empty = new GetClusterNotificationConfig();

    @Import(name="pubsubs", required=true)
      private final List<GetClusterNotificationConfigPubsub> pubsubs;

    public List<GetClusterNotificationConfigPubsub> pubsubs() {
        return this.pubsubs;
    }

    public GetClusterNotificationConfig(List<GetClusterNotificationConfigPubsub> pubsubs) {
        this.pubsubs = Objects.requireNonNull(pubsubs, "expected parameter 'pubsubs' to be non-null");
    }

    private GetClusterNotificationConfig() {
        this.pubsubs = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterNotificationConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetClusterNotificationConfigPubsub> pubsubs;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClusterNotificationConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.pubsubs = defaults.pubsubs;
        }

        public Builder pubsubs(List<GetClusterNotificationConfigPubsub> pubsubs) {
            this.pubsubs = Objects.requireNonNull(pubsubs);
            return this;
        }
        public Builder pubsubs(GetClusterNotificationConfigPubsub... pubsubs) {
            return pubsubs(List.of(pubsubs));
        }        public GetClusterNotificationConfig build() {
            return new GetClusterNotificationConfig(pubsubs);
        }
    }
}
