// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datalakestore.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Data Lake Store virtual network rule information.
 * 
 */
public final class VirtualNetworkRuleResponse extends com.pulumi.resources.InvokeArgs {

    public static final VirtualNetworkRuleResponse Empty = new VirtualNetworkRuleResponse();

    /**
     * The resource identifier.
     * 
     */
    @Import(name="id", required=true)
    private String id;

    public String id() {
        return this.id;
    }

    /**
     * The resource name.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    public String name() {
        return this.name;
    }

    /**
     * The resource identifier for the subnet.
     * 
     */
    @Import(name="subnetId", required=true)
    private String subnetId;

    public String subnetId() {
        return this.subnetId;
    }

    /**
     * The resource type.
     * 
     */
    @Import(name="type", required=true)
    private String type;

    public String type() {
        return this.type;
    }

    private VirtualNetworkRuleResponse() {}

    private VirtualNetworkRuleResponse(VirtualNetworkRuleResponse $) {
        this.id = $.id;
        this.name = $.name;
        this.subnetId = $.subnetId;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualNetworkRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualNetworkRuleResponse $;

        public Builder() {
            $ = new VirtualNetworkRuleResponse();
        }

        public Builder(VirtualNetworkRuleResponse defaults) {
            $ = new VirtualNetworkRuleResponse(Objects.requireNonNull(defaults));
        }

        public Builder id(String id) {
            $.id = id;
            return this;
        }

        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public Builder subnetId(String subnetId) {
            $.subnetId = subnetId;
            return this;
        }

        public Builder type(String type) {
            $.type = type;
            return this;
        }

        public VirtualNetworkRuleResponse build() {
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.subnetId = Objects.requireNonNull($.subnetId, "expected parameter 'subnetId' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
