// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dns.v1beta2;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dns.v1beta2.inputs.ResponsePolicyGKEClusterArgs;
import com.pulumi.googlenative.dns.v1beta2.inputs.ResponsePolicyNetworkArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ResponsePolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final ResponsePolicyArgs Empty = new ResponsePolicyArgs();

    /**
     * For mutating operation requests only. An optional identifier specified by the client. Must be unique for operation resources in the Operations collection.
     * 
     */
    @Import(name="clientOperationId")
    private @Nullable Output<String> clientOperationId;

    /**
     * @return For mutating operation requests only. An optional identifier specified by the client. Must be unique for operation resources in the Operations collection.
     * 
     */
    public Optional<Output<String>> clientOperationId() {
        return Optional.ofNullable(this.clientOperationId);
    }

    /**
     * User-provided description for this Response Policy.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return User-provided description for this Response Policy.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The list of Google Kubernetes Engine clusters to which this response policy is applied.
     * 
     */
    @Import(name="gkeClusters")
    private @Nullable Output<List<ResponsePolicyGKEClusterArgs>> gkeClusters;

    /**
     * @return The list of Google Kubernetes Engine clusters to which this response policy is applied.
     * 
     */
    public Optional<Output<List<ResponsePolicyGKEClusterArgs>>> gkeClusters() {
        return Optional.ofNullable(this.gkeClusters);
    }

    @Import(name="kind")
    private @Nullable Output<String> kind;

    public Optional<Output<String>> kind() {
        return Optional.ofNullable(this.kind);
    }

    /**
     * List of network names specifying networks to which this policy is applied.
     * 
     */
    @Import(name="networks")
    private @Nullable Output<List<ResponsePolicyNetworkArgs>> networks;

    /**
     * @return List of network names specifying networks to which this policy is applied.
     * 
     */
    public Optional<Output<List<ResponsePolicyNetworkArgs>>> networks() {
        return Optional.ofNullable(this.networks);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * User assigned name for this Response Policy.
     * 
     */
    @Import(name="responsePolicyName")
    private @Nullable Output<String> responsePolicyName;

    /**
     * @return User assigned name for this Response Policy.
     * 
     */
    public Optional<Output<String>> responsePolicyName() {
        return Optional.ofNullable(this.responsePolicyName);
    }

    private ResponsePolicyArgs() {}

    private ResponsePolicyArgs(ResponsePolicyArgs $) {
        this.clientOperationId = $.clientOperationId;
        this.description = $.description;
        this.gkeClusters = $.gkeClusters;
        this.kind = $.kind;
        this.networks = $.networks;
        this.project = $.project;
        this.responsePolicyName = $.responsePolicyName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResponsePolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResponsePolicyArgs $;

        public Builder() {
            $ = new ResponsePolicyArgs();
        }

        public Builder(ResponsePolicyArgs defaults) {
            $ = new ResponsePolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clientOperationId For mutating operation requests only. An optional identifier specified by the client. Must be unique for operation resources in the Operations collection.
         * 
         * @return builder
         * 
         */
        public Builder clientOperationId(@Nullable Output<String> clientOperationId) {
            $.clientOperationId = clientOperationId;
            return this;
        }

        /**
         * @param clientOperationId For mutating operation requests only. An optional identifier specified by the client. Must be unique for operation resources in the Operations collection.
         * 
         * @return builder
         * 
         */
        public Builder clientOperationId(String clientOperationId) {
            return clientOperationId(Output.of(clientOperationId));
        }

        /**
         * @param description User-provided description for this Response Policy.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description User-provided description for this Response Policy.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param gkeClusters The list of Google Kubernetes Engine clusters to which this response policy is applied.
         * 
         * @return builder
         * 
         */
        public Builder gkeClusters(@Nullable Output<List<ResponsePolicyGKEClusterArgs>> gkeClusters) {
            $.gkeClusters = gkeClusters;
            return this;
        }

        /**
         * @param gkeClusters The list of Google Kubernetes Engine clusters to which this response policy is applied.
         * 
         * @return builder
         * 
         */
        public Builder gkeClusters(List<ResponsePolicyGKEClusterArgs> gkeClusters) {
            return gkeClusters(Output.of(gkeClusters));
        }

        /**
         * @param gkeClusters The list of Google Kubernetes Engine clusters to which this response policy is applied.
         * 
         * @return builder
         * 
         */
        public Builder gkeClusters(ResponsePolicyGKEClusterArgs... gkeClusters) {
            return gkeClusters(List.of(gkeClusters));
        }

        public Builder kind(@Nullable Output<String> kind) {
            $.kind = kind;
            return this;
        }

        public Builder kind(String kind) {
            return kind(Output.of(kind));
        }

        /**
         * @param networks List of network names specifying networks to which this policy is applied.
         * 
         * @return builder
         * 
         */
        public Builder networks(@Nullable Output<List<ResponsePolicyNetworkArgs>> networks) {
            $.networks = networks;
            return this;
        }

        /**
         * @param networks List of network names specifying networks to which this policy is applied.
         * 
         * @return builder
         * 
         */
        public Builder networks(List<ResponsePolicyNetworkArgs> networks) {
            return networks(Output.of(networks));
        }

        /**
         * @param networks List of network names specifying networks to which this policy is applied.
         * 
         * @return builder
         * 
         */
        public Builder networks(ResponsePolicyNetworkArgs... networks) {
            return networks(List.of(networks));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param responsePolicyName User assigned name for this Response Policy.
         * 
         * @return builder
         * 
         */
        public Builder responsePolicyName(@Nullable Output<String> responsePolicyName) {
            $.responsePolicyName = responsePolicyName;
            return this;
        }

        /**
         * @param responsePolicyName User assigned name for this Response Policy.
         * 
         * @return builder
         * 
         */
        public Builder responsePolicyName(String responsePolicyName) {
            return responsePolicyName(Output.of(responsePolicyName));
        }

        public ResponsePolicyArgs build() {
            return $;
        }
    }

}
