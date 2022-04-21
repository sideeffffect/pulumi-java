// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.databoxedge.inputs;

import com.pulumi.azurenative.databoxedge.inputs.KubernetesIPConfigurationResponse;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Kubernetes node info
 * 
 */
public final class NodeInfoResponse extends com.pulumi.resources.InvokeArgs {

    public static final NodeInfoResponse Empty = new NodeInfoResponse();

    /**
     * IP Configuration of the Kubernetes node.
     * 
     */
    @Import(name="ipConfiguration")
    private @Nullable List<KubernetesIPConfigurationResponse> ipConfiguration;

    public Optional<List<KubernetesIPConfigurationResponse>> ipConfiguration() {
        return Optional.ofNullable(this.ipConfiguration);
    }

    /**
     * Node name.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    public String name() {
        return this.name;
    }

    /**
     * Node type - Master/Worker
     * 
     */
    @Import(name="type", required=true)
    private String type;

    public String type() {
        return this.type;
    }

    private NodeInfoResponse() {}

    private NodeInfoResponse(NodeInfoResponse $) {
        this.ipConfiguration = $.ipConfiguration;
        this.name = $.name;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NodeInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NodeInfoResponse $;

        public Builder() {
            $ = new NodeInfoResponse();
        }

        public Builder(NodeInfoResponse defaults) {
            $ = new NodeInfoResponse(Objects.requireNonNull(defaults));
        }

        public Builder ipConfiguration(@Nullable List<KubernetesIPConfigurationResponse> ipConfiguration) {
            $.ipConfiguration = ipConfiguration;
            return this;
        }

        public Builder ipConfiguration(KubernetesIPConfigurationResponse... ipConfiguration) {
            return ipConfiguration(List.of(ipConfiguration));
        }

        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public Builder type(String type) {
            $.type = type;
            return this;
        }

        public NodeInfoResponse build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
