// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.glacier;

import io.pulumi.aws.glacier.inputs.VaultNotificationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VaultArgs extends io.pulumi.resources.ResourceArgs {

    public static final VaultArgs Empty = new VaultArgs();

    /**
     * The policy document. This is a JSON formatted string.
     * The heredoc syntax or `file` function is helpful here. Use the [Glacier Developer Guide](https://docs.aws.amazon.com/amazonglacier/latest/dev/vault-access-policy.html) for more information on Glacier Vault Policy
     * 
     */
    @InputImport(name="accessPolicy")
      private final @Nullable Input<String> accessPolicy;

    public Input<String> getAccessPolicy() {
        return this.accessPolicy == null ? Input.empty() : this.accessPolicy;
    }

    /**
     * The name of the Vault. Names can be between 1 and 255 characters long and the valid characters are a-z, A-Z, 0-9, '_' (underscore), '-' (hyphen), and '.' (period).
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The notifications for the Vault. Fields documented below.
     * 
     */
    @InputImport(name="notification")
      private final @Nullable Input<VaultNotificationArgs> notification;

    public Input<VaultNotificationArgs> getNotification() {
        return this.notification == null ? Input.empty() : this.notification;
    }

    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public VaultArgs(
        @Nullable Input<String> accessPolicy,
        @Nullable Input<String> name,
        @Nullable Input<VaultNotificationArgs> notification,
        @Nullable Input<Map<String,String>> tags) {
        this.accessPolicy = accessPolicy;
        this.name = name;
        this.notification = notification;
        this.tags = tags;
    }

    private VaultArgs() {
        this.accessPolicy = Input.empty();
        this.name = Input.empty();
        this.notification = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VaultArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> accessPolicy;
        private @Nullable Input<String> name;
        private @Nullable Input<VaultNotificationArgs> notification;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(VaultArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessPolicy = defaults.accessPolicy;
    	      this.name = defaults.name;
    	      this.notification = defaults.notification;
    	      this.tags = defaults.tags;
        }

        public Builder accessPolicy(@Nullable Input<String> accessPolicy) {
            this.accessPolicy = accessPolicy;
            return this;
        }

        public Builder accessPolicy(@Nullable String accessPolicy) {
            this.accessPolicy = Input.ofNullable(accessPolicy);
            return this;
        }

        public Builder name(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder notification(@Nullable Input<VaultNotificationArgs> notification) {
            this.notification = notification;
            return this;
        }

        public Builder notification(@Nullable VaultNotificationArgs notification) {
            this.notification = Input.ofNullable(notification);
            return this;
        }

        public Builder tags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }
        public VaultArgs build() {
            return new VaultArgs(accessPolicy, name, notification, tags);
        }
    }
}
