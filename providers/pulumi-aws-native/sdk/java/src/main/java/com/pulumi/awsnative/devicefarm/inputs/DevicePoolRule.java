// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.devicefarm.inputs;

import com.pulumi.awsnative.devicefarm.enums.DevicePoolRuleAttribute;
import com.pulumi.awsnative.devicefarm.enums.DevicePoolRuleOperator;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Represents a condition for a device pool.
 * 
 */
public final class DevicePoolRule extends com.pulumi.resources.InvokeArgs {

    public static final DevicePoolRule Empty = new DevicePoolRule();

    /**
     * The rule&#39;s stringified attribute.
     * 
     */
    @Import(name="attribute")
    private @Nullable DevicePoolRuleAttribute attribute;

    public Optional<DevicePoolRuleAttribute> attribute() {
        return Optional.ofNullable(this.attribute);
    }

    /**
     * Specifies how Device Farm compares the rule&#39;s attribute to the value.
     * 
     */
    @Import(name="operator")
    private @Nullable DevicePoolRuleOperator operator;

    public Optional<DevicePoolRuleOperator> operator() {
        return Optional.ofNullable(this.operator);
    }

    /**
     * The rule&#39;s value.
     * 
     */
    @Import(name="value")
    private @Nullable String value;

    public Optional<String> value() {
        return Optional.ofNullable(this.value);
    }

    private DevicePoolRule() {}

    private DevicePoolRule(DevicePoolRule $) {
        this.attribute = $.attribute;
        this.operator = $.operator;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DevicePoolRule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DevicePoolRule $;

        public Builder() {
            $ = new DevicePoolRule();
        }

        public Builder(DevicePoolRule defaults) {
            $ = new DevicePoolRule(Objects.requireNonNull(defaults));
        }

        public Builder attribute(@Nullable DevicePoolRuleAttribute attribute) {
            $.attribute = attribute;
            return this;
        }

        public Builder operator(@Nullable DevicePoolRuleOperator operator) {
            $.operator = operator;
            return this;
        }

        public Builder value(@Nullable String value) {
            $.value = value;
            return this;
        }

        public DevicePoolRule build() {
            return $;
        }
    }

}
