// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.features.inputs;

import com.pulumi.azurenative.features.enums.SubscriptionFeatureRegistrationState;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SubscriptionFeatureRegistrationPropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final SubscriptionFeatureRegistrationPropertiesArgs Empty = new SubscriptionFeatureRegistrationPropertiesArgs();

    /**
     * The feature description.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The feature description.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Key-value pairs for meta data.
     * 
     */
    @Import(name="metadata")
    private @Nullable Output<Map<String,String>> metadata;

    /**
     * @return Key-value pairs for meta data.
     * 
     */
    public Optional<Output<Map<String,String>>> metadata() {
        return Optional.ofNullable(this.metadata);
    }

    /**
     * Indicates whether feature should be displayed in Portal.
     * 
     */
    @Import(name="shouldFeatureDisplayInPortal")
    private @Nullable Output<Boolean> shouldFeatureDisplayInPortal;

    /**
     * @return Indicates whether feature should be displayed in Portal.
     * 
     */
    public Optional<Output<Boolean>> shouldFeatureDisplayInPortal() {
        return Optional.ofNullable(this.shouldFeatureDisplayInPortal);
    }

    /**
     * The state.
     * 
     */
    @Import(name="state")
    private @Nullable Output<Either<String,SubscriptionFeatureRegistrationState>> state;

    /**
     * @return The state.
     * 
     */
    public Optional<Output<Either<String,SubscriptionFeatureRegistrationState>>> state() {
        return Optional.ofNullable(this.state);
    }

    private SubscriptionFeatureRegistrationPropertiesArgs() {}

    private SubscriptionFeatureRegistrationPropertiesArgs(SubscriptionFeatureRegistrationPropertiesArgs $) {
        this.description = $.description;
        this.metadata = $.metadata;
        this.shouldFeatureDisplayInPortal = $.shouldFeatureDisplayInPortal;
        this.state = $.state;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SubscriptionFeatureRegistrationPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SubscriptionFeatureRegistrationPropertiesArgs $;

        public Builder() {
            $ = new SubscriptionFeatureRegistrationPropertiesArgs();
        }

        public Builder(SubscriptionFeatureRegistrationPropertiesArgs defaults) {
            $ = new SubscriptionFeatureRegistrationPropertiesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description The feature description.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The feature description.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param metadata Key-value pairs for meta data.
         * 
         * @return builder
         * 
         */
        public Builder metadata(@Nullable Output<Map<String,String>> metadata) {
            $.metadata = metadata;
            return this;
        }

        /**
         * @param metadata Key-value pairs for meta data.
         * 
         * @return builder
         * 
         */
        public Builder metadata(Map<String,String> metadata) {
            return metadata(Output.of(metadata));
        }

        /**
         * @param shouldFeatureDisplayInPortal Indicates whether feature should be displayed in Portal.
         * 
         * @return builder
         * 
         */
        public Builder shouldFeatureDisplayInPortal(@Nullable Output<Boolean> shouldFeatureDisplayInPortal) {
            $.shouldFeatureDisplayInPortal = shouldFeatureDisplayInPortal;
            return this;
        }

        /**
         * @param shouldFeatureDisplayInPortal Indicates whether feature should be displayed in Portal.
         * 
         * @return builder
         * 
         */
        public Builder shouldFeatureDisplayInPortal(Boolean shouldFeatureDisplayInPortal) {
            return shouldFeatureDisplayInPortal(Output.of(shouldFeatureDisplayInPortal));
        }

        /**
         * @param state The state.
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<Either<String,SubscriptionFeatureRegistrationState>> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state The state.
         * 
         * @return builder
         * 
         */
        public Builder state(Either<String,SubscriptionFeatureRegistrationState> state) {
            return state(Output.of(state));
        }

        /**
         * @param state The state.
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            return state(Either.ofLeft(state));
        }

        /**
         * @param state The state.
         * 
         * @return builder
         * 
         */
        public Builder state(SubscriptionFeatureRegistrationState state) {
            return state(Either.ofRight(state));
        }

        public SubscriptionFeatureRegistrationPropertiesArgs build() {
            $.shouldFeatureDisplayInPortal = Codegen.booleanProp("shouldFeatureDisplayInPortal").output().arg($.shouldFeatureDisplayInPortal).def(false).getNullable();
            return $;
        }
    }

}
