// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.gamelift.inputs;

import com.pulumi.awsnative.gamelift.enums.AliasRoutingStrategyType;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AliasRoutingStrategyArgs extends ResourceArgs {

    public static final AliasRoutingStrategyArgs Empty = new AliasRoutingStrategyArgs();

    /**
     * A unique identifier for a fleet that the alias points to. If you specify SIMPLE for the Type property, you must specify this property.
     * 
     */
    @Import(name="fleetId")
    private @Nullable Output<String> fleetId;

    /**
     * @return A unique identifier for a fleet that the alias points to. If you specify SIMPLE for the Type property, you must specify this property.
     * 
     */
    public Optional<Output<String>> fleetId() {
        return Optional.ofNullable(this.fleetId);
    }

    /**
     * The message text to be used with a terminal routing strategy. If you specify TERMINAL for the Type property, you must specify this property.
     * 
     */
    @Import(name="message")
    private @Nullable Output<String> message;

    /**
     * @return The message text to be used with a terminal routing strategy. If you specify TERMINAL for the Type property, you must specify this property.
     * 
     */
    public Optional<Output<String>> message() {
        return Optional.ofNullable(this.message);
    }

    /**
     * Simple routing strategy. The alias resolves to one specific fleet. Use this type when routing to active fleets.
     * 
     */
    @Import(name="type", required=true)
    private Output<AliasRoutingStrategyType> type;

    /**
     * @return Simple routing strategy. The alias resolves to one specific fleet. Use this type when routing to active fleets.
     * 
     */
    public Output<AliasRoutingStrategyType> type() {
        return this.type;
    }

    private AliasRoutingStrategyArgs() {}

    private AliasRoutingStrategyArgs(AliasRoutingStrategyArgs $) {
        this.fleetId = $.fleetId;
        this.message = $.message;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AliasRoutingStrategyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AliasRoutingStrategyArgs $;

        public Builder() {
            $ = new AliasRoutingStrategyArgs();
        }

        public Builder(AliasRoutingStrategyArgs defaults) {
            $ = new AliasRoutingStrategyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param fleetId A unique identifier for a fleet that the alias points to. If you specify SIMPLE for the Type property, you must specify this property.
         * 
         * @return builder
         * 
         */
        public Builder fleetId(@Nullable Output<String> fleetId) {
            $.fleetId = fleetId;
            return this;
        }

        /**
         * @param fleetId A unique identifier for a fleet that the alias points to. If you specify SIMPLE for the Type property, you must specify this property.
         * 
         * @return builder
         * 
         */
        public Builder fleetId(String fleetId) {
            return fleetId(Output.of(fleetId));
        }

        /**
         * @param message The message text to be used with a terminal routing strategy. If you specify TERMINAL for the Type property, you must specify this property.
         * 
         * @return builder
         * 
         */
        public Builder message(@Nullable Output<String> message) {
            $.message = message;
            return this;
        }

        /**
         * @param message The message text to be used with a terminal routing strategy. If you specify TERMINAL for the Type property, you must specify this property.
         * 
         * @return builder
         * 
         */
        public Builder message(String message) {
            return message(Output.of(message));
        }

        /**
         * @param type Simple routing strategy. The alias resolves to one specific fleet. Use this type when routing to active fleets.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<AliasRoutingStrategyType> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Simple routing strategy. The alias resolves to one specific fleet. Use this type when routing to active fleets.
         * 
         * @return builder
         * 
         */
        public Builder type(AliasRoutingStrategyType type) {
            return type(Output.of(type));
        }

        public AliasRoutingStrategyArgs build() {
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
