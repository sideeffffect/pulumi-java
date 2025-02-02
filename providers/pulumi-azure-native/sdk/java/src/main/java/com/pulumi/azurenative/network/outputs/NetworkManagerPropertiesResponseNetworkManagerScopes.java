// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class NetworkManagerPropertiesResponseNetworkManagerScopes {
    /**
     * @return List of management groups.
     * 
     */
    private final @Nullable List<String> managementGroups;
    /**
     * @return List of subscriptions.
     * 
     */
    private final @Nullable List<String> subscriptions;

    @CustomType.Constructor
    private NetworkManagerPropertiesResponseNetworkManagerScopes(
        @CustomType.Parameter("managementGroups") @Nullable List<String> managementGroups,
        @CustomType.Parameter("subscriptions") @Nullable List<String> subscriptions) {
        this.managementGroups = managementGroups;
        this.subscriptions = subscriptions;
    }

    /**
     * @return List of management groups.
     * 
     */
    public List<String> managementGroups() {
        return this.managementGroups == null ? List.of() : this.managementGroups;
    }
    /**
     * @return List of subscriptions.
     * 
     */
    public List<String> subscriptions() {
        return this.subscriptions == null ? List.of() : this.subscriptions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkManagerPropertiesResponseNetworkManagerScopes defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> managementGroups;
        private @Nullable List<String> subscriptions;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkManagerPropertiesResponseNetworkManagerScopes defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.managementGroups = defaults.managementGroups;
    	      this.subscriptions = defaults.subscriptions;
        }

        public Builder managementGroups(@Nullable List<String> managementGroups) {
            this.managementGroups = managementGroups;
            return this;
        }
        public Builder managementGroups(String... managementGroups) {
            return managementGroups(List.of(managementGroups));
        }
        public Builder subscriptions(@Nullable List<String> subscriptions) {
            this.subscriptions = subscriptions;
            return this;
        }
        public Builder subscriptions(String... subscriptions) {
            return subscriptions(List.of(subscriptions));
        }        public NetworkManagerPropertiesResponseNetworkManagerScopes build() {
            return new NetworkManagerPropertiesResponseNetworkManagerScopes(managementGroups, subscriptions);
        }
    }
}
