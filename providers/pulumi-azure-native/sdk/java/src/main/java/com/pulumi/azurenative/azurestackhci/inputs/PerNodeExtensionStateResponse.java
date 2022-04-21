// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.azurestackhci.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Status of Arc Extension for a particular node in HCI Cluster.
 * 
 */
public final class PerNodeExtensionStateResponse extends com.pulumi.resources.InvokeArgs {

    public static final PerNodeExtensionStateResponse Empty = new PerNodeExtensionStateResponse();

    /**
     * Fully qualified resource ID for the particular Arc Extension on this node.
     * 
     */
    @Import(name="extension", required=true)
    private String extension;

    public String extension() {
        return this.extension;
    }

    /**
     * Name of the node in HCI Cluster.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    public String name() {
        return this.name;
    }

    /**
     * State of Arc Extension in this node.
     * 
     */
    @Import(name="state", required=true)
    private String state;

    public String state() {
        return this.state;
    }

    private PerNodeExtensionStateResponse() {}

    private PerNodeExtensionStateResponse(PerNodeExtensionStateResponse $) {
        this.extension = $.extension;
        this.name = $.name;
        this.state = $.state;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PerNodeExtensionStateResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PerNodeExtensionStateResponse $;

        public Builder() {
            $ = new PerNodeExtensionStateResponse();
        }

        public Builder(PerNodeExtensionStateResponse defaults) {
            $ = new PerNodeExtensionStateResponse(Objects.requireNonNull(defaults));
        }

        public Builder extension(String extension) {
            $.extension = extension;
            return this;
        }

        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public Builder state(String state) {
            $.state = state;
            return this;
        }

        public PerNodeExtensionStateResponse build() {
            $.extension = Objects.requireNonNull($.extension, "expected parameter 'extension' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.state = Objects.requireNonNull($.state, "expected parameter 'state' to be non-null");
            return $;
        }
    }

}
