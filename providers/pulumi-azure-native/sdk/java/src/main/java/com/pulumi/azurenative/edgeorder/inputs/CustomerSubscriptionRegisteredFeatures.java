// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.edgeorder.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Represents subscription registered features
 * 
 */
public final class CustomerSubscriptionRegisteredFeatures extends com.pulumi.resources.InvokeArgs {

    public static final CustomerSubscriptionRegisteredFeatures Empty = new CustomerSubscriptionRegisteredFeatures();

    /**
     * Name of subscription registered feature
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    /**
     * @return Name of subscription registered feature
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * State of subscription registered feature
     * 
     */
    @Import(name="state")
    private @Nullable String state;

    /**
     * @return State of subscription registered feature
     * 
     */
    public Optional<String> state() {
        return Optional.ofNullable(this.state);
    }

    private CustomerSubscriptionRegisteredFeatures() {}

    private CustomerSubscriptionRegisteredFeatures(CustomerSubscriptionRegisteredFeatures $) {
        this.name = $.name;
        this.state = $.state;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CustomerSubscriptionRegisteredFeatures defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CustomerSubscriptionRegisteredFeatures $;

        public Builder() {
            $ = new CustomerSubscriptionRegisteredFeatures();
        }

        public Builder(CustomerSubscriptionRegisteredFeatures defaults) {
            $ = new CustomerSubscriptionRegisteredFeatures(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Name of subscription registered feature
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        /**
         * @param state State of subscription registered feature
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable String state) {
            $.state = state;
            return this;
        }

        public CustomerSubscriptionRegisteredFeatures build() {
            return $;
        }
    }

}
