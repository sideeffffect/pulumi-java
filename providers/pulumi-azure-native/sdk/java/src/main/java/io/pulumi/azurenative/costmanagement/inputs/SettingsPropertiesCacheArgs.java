// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.costmanagement.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SettingsPropertiesCacheArgs extends io.pulumi.resources.ResourceArgs {

    public static final SettingsPropertiesCacheArgs Empty = new SettingsPropertiesCacheArgs();

    /**
     * Indicates the account type. Allowed values include: EA, PAYG, Modern, Internal, Unknown.
     * 
     */
    @InputImport(name="channel", required=true)
      private final Input<String> channel;

    public Input<String> getChannel() {
        return this.channel;
    }

    /**
     * Resource ID used by Resource Manager to uniquely identify the scope.
     * 
     */
    @InputImport(name="id", required=true)
      private final Input<String> id;

    public Input<String> getId() {
        return this.id;
    }

    /**
     * Display name for the scope.
     * 
     */
    @InputImport(name="name", required=true)
      private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    /**
     * Resource ID of the parent scope. For instance, subscription's resource ID for a resource group or a management group resource ID for a subscription.
     * 
     */
    @InputImport(name="parent")
      private final @Nullable Input<String> parent;

    public Input<String> getParent() {
        return this.parent == null ? Input.empty() : this.parent;
    }

    /**
     * Indicates the status of the scope. Status only applies to subscriptions and billing accounts.
     * 
     */
    @InputImport(name="status")
      private final @Nullable Input<String> status;

    public Input<String> getStatus() {
        return this.status == null ? Input.empty() : this.status;
    }

    /**
     * Indicates the type of modern account. Allowed values include: Individual, Enterprise, Partner, Indirect, NotApplicable
     * 
     */
    @InputImport(name="subchannel", required=true)
      private final Input<String> subchannel;

    public Input<String> getSubchannel() {
        return this.subchannel;
    }

    public SettingsPropertiesCacheArgs(
        Input<String> channel,
        Input<String> id,
        Input<String> name,
        @Nullable Input<String> parent,
        @Nullable Input<String> status,
        Input<String> subchannel) {
        this.channel = Objects.requireNonNull(channel, "expected parameter 'channel' to be non-null");
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.parent = parent;
        this.status = status;
        this.subchannel = Objects.requireNonNull(subchannel, "expected parameter 'subchannel' to be non-null");
    }

    private SettingsPropertiesCacheArgs() {
        this.channel = Input.empty();
        this.id = Input.empty();
        this.name = Input.empty();
        this.parent = Input.empty();
        this.status = Input.empty();
        this.subchannel = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SettingsPropertiesCacheArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> channel;
        private Input<String> id;
        private Input<String> name;
        private @Nullable Input<String> parent;
        private @Nullable Input<String> status;
        private Input<String> subchannel;

        public Builder() {
    	      // Empty
        }

        public Builder(SettingsPropertiesCacheArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.channel = defaults.channel;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.parent = defaults.parent;
    	      this.status = defaults.status;
    	      this.subchannel = defaults.subchannel;
        }

        public Builder channel(Input<String> channel) {
            this.channel = Objects.requireNonNull(channel);
            return this;
        }

        public Builder channel(String channel) {
            this.channel = Input.of(Objects.requireNonNull(channel));
            return this;
        }

        public Builder id(Input<String> id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder id(String id) {
            this.id = Input.of(Objects.requireNonNull(id));
            return this;
        }

        public Builder name(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder name(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder parent(@Nullable Input<String> parent) {
            this.parent = parent;
            return this;
        }

        public Builder parent(@Nullable String parent) {
            this.parent = Input.ofNullable(parent);
            return this;
        }

        public Builder status(@Nullable Input<String> status) {
            this.status = status;
            return this;
        }

        public Builder status(@Nullable String status) {
            this.status = Input.ofNullable(status);
            return this;
        }

        public Builder subchannel(Input<String> subchannel) {
            this.subchannel = Objects.requireNonNull(subchannel);
            return this;
        }

        public Builder subchannel(String subchannel) {
            this.subchannel = Input.of(Objects.requireNonNull(subchannel));
            return this;
        }
        public SettingsPropertiesCacheArgs build() {
            return new SettingsPropertiesCacheArgs(channel, id, name, parent, status, subchannel);
        }
    }
}
