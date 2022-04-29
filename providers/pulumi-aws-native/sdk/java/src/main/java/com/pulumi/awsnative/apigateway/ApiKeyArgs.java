// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.apigateway;

import com.pulumi.awsnative.apigateway.inputs.ApiKeyStageKeyArgs;
import com.pulumi.awsnative.apigateway.inputs.ApiKeyTagArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApiKeyArgs extends ResourceArgs {

    public static final ApiKeyArgs Empty = new ApiKeyArgs();

    /**
     * An AWS Marketplace customer identifier to use when integrating with the AWS SaaS Marketplace.
     * 
     */
    @Import(name="customerId")
    private @Nullable Output<String> customerId;

    /**
     * @return An AWS Marketplace customer identifier to use when integrating with the AWS SaaS Marketplace.
     * 
     */
    public Optional<Output<String>> customerId() {
        return Optional.ofNullable(this.customerId);
    }

    /**
     * A description of the purpose of the API key.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return A description of the purpose of the API key.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Indicates whether the API key can be used by clients.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Indicates whether the API key can be used by clients.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * Specifies whether the key identifier is distinct from the created API key value. This parameter is deprecated and should not be used.
     * 
     */
    @Import(name="generateDistinctId")
    private @Nullable Output<Boolean> generateDistinctId;

    /**
     * @return Specifies whether the key identifier is distinct from the created API key value. This parameter is deprecated and should not be used.
     * 
     */
    public Optional<Output<Boolean>> generateDistinctId() {
        return Optional.ofNullable(this.generateDistinctId);
    }

    /**
     * A name for the API key. If you don&#39;t specify a name, AWS CloudFormation generates a unique physical ID and uses that ID for the API key name.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return A name for the API key. If you don&#39;t specify a name, AWS CloudFormation generates a unique physical ID and uses that ID for the API key name.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * A list of stages to associate with this API key.
     * 
     */
    @Import(name="stageKeys")
    private @Nullable Output<List<ApiKeyStageKeyArgs>> stageKeys;

    /**
     * @return A list of stages to associate with this API key.
     * 
     */
    public Optional<Output<List<ApiKeyStageKeyArgs>>> stageKeys() {
        return Optional.ofNullable(this.stageKeys);
    }

    /**
     * An array of arbitrary tags (key-value pairs) to associate with the API key.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<ApiKeyTagArgs>> tags;

    /**
     * @return An array of arbitrary tags (key-value pairs) to associate with the API key.
     * 
     */
    public Optional<Output<List<ApiKeyTagArgs>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The value of the API key. Must be at least 20 characters long.
     * 
     */
    @Import(name="value")
    private @Nullable Output<String> value;

    /**
     * @return The value of the API key. Must be at least 20 characters long.
     * 
     */
    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    private ApiKeyArgs() {}

    private ApiKeyArgs(ApiKeyArgs $) {
        this.customerId = $.customerId;
        this.description = $.description;
        this.enabled = $.enabled;
        this.generateDistinctId = $.generateDistinctId;
        this.name = $.name;
        this.stageKeys = $.stageKeys;
        this.tags = $.tags;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApiKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApiKeyArgs $;

        public Builder() {
            $ = new ApiKeyArgs();
        }

        public Builder(ApiKeyArgs defaults) {
            $ = new ApiKeyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param customerId An AWS Marketplace customer identifier to use when integrating with the AWS SaaS Marketplace.
         * 
         * @return builder
         * 
         */
        public Builder customerId(@Nullable Output<String> customerId) {
            $.customerId = customerId;
            return this;
        }

        /**
         * @param customerId An AWS Marketplace customer identifier to use when integrating with the AWS SaaS Marketplace.
         * 
         * @return builder
         * 
         */
        public Builder customerId(String customerId) {
            return customerId(Output.of(customerId));
        }

        /**
         * @param description A description of the purpose of the API key.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description A description of the purpose of the API key.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param enabled Indicates whether the API key can be used by clients.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Indicates whether the API key can be used by clients.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param generateDistinctId Specifies whether the key identifier is distinct from the created API key value. This parameter is deprecated and should not be used.
         * 
         * @return builder
         * 
         */
        public Builder generateDistinctId(@Nullable Output<Boolean> generateDistinctId) {
            $.generateDistinctId = generateDistinctId;
            return this;
        }

        /**
         * @param generateDistinctId Specifies whether the key identifier is distinct from the created API key value. This parameter is deprecated and should not be used.
         * 
         * @return builder
         * 
         */
        public Builder generateDistinctId(Boolean generateDistinctId) {
            return generateDistinctId(Output.of(generateDistinctId));
        }

        /**
         * @param name A name for the API key. If you don&#39;t specify a name, AWS CloudFormation generates a unique physical ID and uses that ID for the API key name.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name A name for the API key. If you don&#39;t specify a name, AWS CloudFormation generates a unique physical ID and uses that ID for the API key name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param stageKeys A list of stages to associate with this API key.
         * 
         * @return builder
         * 
         */
        public Builder stageKeys(@Nullable Output<List<ApiKeyStageKeyArgs>> stageKeys) {
            $.stageKeys = stageKeys;
            return this;
        }

        /**
         * @param stageKeys A list of stages to associate with this API key.
         * 
         * @return builder
         * 
         */
        public Builder stageKeys(List<ApiKeyStageKeyArgs> stageKeys) {
            return stageKeys(Output.of(stageKeys));
        }

        /**
         * @param stageKeys A list of stages to associate with this API key.
         * 
         * @return builder
         * 
         */
        public Builder stageKeys(ApiKeyStageKeyArgs... stageKeys) {
            return stageKeys(List.of(stageKeys));
        }

        /**
         * @param tags An array of arbitrary tags (key-value pairs) to associate with the API key.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<ApiKeyTagArgs>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags An array of arbitrary tags (key-value pairs) to associate with the API key.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<ApiKeyTagArgs> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags An array of arbitrary tags (key-value pairs) to associate with the API key.
         * 
         * @return builder
         * 
         */
        public Builder tags(ApiKeyTagArgs... tags) {
            return tags(List.of(tags));
        }

        /**
         * @param value The value of the API key. Must be at least 20 characters long.
         * 
         * @return builder
         * 
         */
        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value The value of the API key. Must be at least 20 characters long.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public ApiKeyArgs build() {
            return $;
        }
    }

}
