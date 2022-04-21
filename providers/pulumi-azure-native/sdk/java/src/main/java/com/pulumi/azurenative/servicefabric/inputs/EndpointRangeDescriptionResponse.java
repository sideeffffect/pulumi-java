// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.servicefabric.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


/**
 * Port range details
 * 
 */
public final class EndpointRangeDescriptionResponse extends com.pulumi.resources.InvokeArgs {

    public static final EndpointRangeDescriptionResponse Empty = new EndpointRangeDescriptionResponse();

    /**
     * End port of a range of ports
     * 
     */
    @Import(name="endPort", required=true)
    private Integer endPort;

    public Integer endPort() {
        return this.endPort;
    }

    /**
     * Starting port of a range of ports
     * 
     */
    @Import(name="startPort", required=true)
    private Integer startPort;

    public Integer startPort() {
        return this.startPort;
    }

    private EndpointRangeDescriptionResponse() {}

    private EndpointRangeDescriptionResponse(EndpointRangeDescriptionResponse $) {
        this.endPort = $.endPort;
        this.startPort = $.startPort;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EndpointRangeDescriptionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EndpointRangeDescriptionResponse $;

        public Builder() {
            $ = new EndpointRangeDescriptionResponse();
        }

        public Builder(EndpointRangeDescriptionResponse defaults) {
            $ = new EndpointRangeDescriptionResponse(Objects.requireNonNull(defaults));
        }

        public Builder endPort(Integer endPort) {
            $.endPort = endPort;
            return this;
        }

        public Builder startPort(Integer startPort) {
            $.startPort = startPort;
            return this;
        }

        public EndpointRangeDescriptionResponse build() {
            $.endPort = Objects.requireNonNull($.endPort, "expected parameter 'endPort' to be non-null");
            $.startPort = Objects.requireNonNull($.startPort, "expected parameter 'startPort' to be non-null");
            return $;
        }
    }

}
