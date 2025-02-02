// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.apimanagement;

import com.pulumi.azurenative.apimanagement.inputs.KeyVaultContractCreatePropertiesArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NamedValueArgs extends com.pulumi.resources.ResourceArgs {

    public static final NamedValueArgs Empty = new NamedValueArgs();

    /**
     * Unique name of NamedValue. It may contain only letters, digits, period, dash, and underscore characters.
     * 
     */
    @Import(name="displayName", required=true)
    private Output<String> displayName;

    /**
     * @return Unique name of NamedValue. It may contain only letters, digits, period, dash, and underscore characters.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }

    /**
     * KeyVault location details of the namedValue.
     * 
     */
    @Import(name="keyVault")
    private @Nullable Output<KeyVaultContractCreatePropertiesArgs> keyVault;

    /**
     * @return KeyVault location details of the namedValue.
     * 
     */
    public Optional<Output<KeyVaultContractCreatePropertiesArgs>> keyVault() {
        return Optional.ofNullable(this.keyVault);
    }

    /**
     * Identifier of the NamedValue.
     * 
     */
    @Import(name="namedValueId")
    private @Nullable Output<String> namedValueId;

    /**
     * @return Identifier of the NamedValue.
     * 
     */
    public Optional<Output<String>> namedValueId() {
        return Optional.ofNullable(this.namedValueId);
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Determines whether the value is a secret and should be encrypted or not. Default value is false.
     * 
     */
    @Import(name="secret")
    private @Nullable Output<Boolean> secret;

    /**
     * @return Determines whether the value is a secret and should be encrypted or not. Default value is false.
     * 
     */
    public Optional<Output<Boolean>> secret() {
        return Optional.ofNullable(this.secret);
    }

    /**
     * The name of the API Management service.
     * 
     */
    @Import(name="serviceName", required=true)
    private Output<String> serviceName;

    /**
     * @return The name of the API Management service.
     * 
     */
    public Output<String> serviceName() {
        return this.serviceName;
    }

    /**
     * Optional tags that when provided can be used to filter the NamedValue list.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<String>> tags;

    /**
     * @return Optional tags that when provided can be used to filter the NamedValue list.
     * 
     */
    public Optional<Output<List<String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * Value of the NamedValue. Can contain policy expressions. It may not be empty or consist only of whitespace. This property will not be filled on &#39;GET&#39; operations! Use &#39;/listSecrets&#39; POST request to get the value.
     * 
     */
    @Import(name="value")
    private @Nullable Output<String> value;

    /**
     * @return Value of the NamedValue. Can contain policy expressions. It may not be empty or consist only of whitespace. This property will not be filled on &#39;GET&#39; operations! Use &#39;/listSecrets&#39; POST request to get the value.
     * 
     */
    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    private NamedValueArgs() {}

    private NamedValueArgs(NamedValueArgs $) {
        this.displayName = $.displayName;
        this.keyVault = $.keyVault;
        this.namedValueId = $.namedValueId;
        this.resourceGroupName = $.resourceGroupName;
        this.secret = $.secret;
        this.serviceName = $.serviceName;
        this.tags = $.tags;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NamedValueArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NamedValueArgs $;

        public Builder() {
            $ = new NamedValueArgs();
        }

        public Builder(NamedValueArgs defaults) {
            $ = new NamedValueArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param displayName Unique name of NamedValue. It may contain only letters, digits, period, dash, and underscore characters.
         * 
         * @return builder
         * 
         */
        public Builder displayName(Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName Unique name of NamedValue. It may contain only letters, digits, period, dash, and underscore characters.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param keyVault KeyVault location details of the namedValue.
         * 
         * @return builder
         * 
         */
        public Builder keyVault(@Nullable Output<KeyVaultContractCreatePropertiesArgs> keyVault) {
            $.keyVault = keyVault;
            return this;
        }

        /**
         * @param keyVault KeyVault location details of the namedValue.
         * 
         * @return builder
         * 
         */
        public Builder keyVault(KeyVaultContractCreatePropertiesArgs keyVault) {
            return keyVault(Output.of(keyVault));
        }

        /**
         * @param namedValueId Identifier of the NamedValue.
         * 
         * @return builder
         * 
         */
        public Builder namedValueId(@Nullable Output<String> namedValueId) {
            $.namedValueId = namedValueId;
            return this;
        }

        /**
         * @param namedValueId Identifier of the NamedValue.
         * 
         * @return builder
         * 
         */
        public Builder namedValueId(String namedValueId) {
            return namedValueId(Output.of(namedValueId));
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param secret Determines whether the value is a secret and should be encrypted or not. Default value is false.
         * 
         * @return builder
         * 
         */
        public Builder secret(@Nullable Output<Boolean> secret) {
            $.secret = secret;
            return this;
        }

        /**
         * @param secret Determines whether the value is a secret and should be encrypted or not. Default value is false.
         * 
         * @return builder
         * 
         */
        public Builder secret(Boolean secret) {
            return secret(Output.of(secret));
        }

        /**
         * @param serviceName The name of the API Management service.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(Output<String> serviceName) {
            $.serviceName = serviceName;
            return this;
        }

        /**
         * @param serviceName The name of the API Management service.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(String serviceName) {
            return serviceName(Output.of(serviceName));
        }

        /**
         * @param tags Optional tags that when provided can be used to filter the NamedValue list.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Optional tags that when provided can be used to filter the NamedValue list.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags Optional tags that when provided can be used to filter the NamedValue list.
         * 
         * @return builder
         * 
         */
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }

        /**
         * @param value Value of the NamedValue. Can contain policy expressions. It may not be empty or consist only of whitespace. This property will not be filled on &#39;GET&#39; operations! Use &#39;/listSecrets&#39; POST request to get the value.
         * 
         * @return builder
         * 
         */
        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value Value of the NamedValue. Can contain policy expressions. It may not be empty or consist only of whitespace. This property will not be filled on &#39;GET&#39; operations! Use &#39;/listSecrets&#39; POST request to get the value.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public NamedValueArgs build() {
            $.displayName = Objects.requireNonNull($.displayName, "expected parameter 'displayName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.serviceName = Objects.requireNonNull($.serviceName, "expected parameter 'serviceName' to be non-null");
            return $;
        }
    }

}
