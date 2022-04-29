// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.monitoring.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.resources.InvokeArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetIstioCanonicalServiceArgs extends InvokeArgs {

    public static final GetIstioCanonicalServiceArgs Empty = new GetIstioCanonicalServiceArgs();

    /**
     * The name of the canonical service underlying this service.
     * Corresponds to the destination_canonical_service_name metric label in label in Istio metrics.
     * 
     */
    @Import(name="canonicalService", required=true)
    private String canonicalService;

    /**
     * @return The name of the canonical service underlying this service.
     * Corresponds to the destination_canonical_service_name metric label in label in Istio metrics.
     * 
     */
    public String canonicalService() {
        return this.canonicalService;
    }

    /**
     * The namespace of the canonical service underlying this service.
     * Corresponds to the destination_canonical_service_namespace metric label in Istio metrics.
     * 
     */
    @Import(name="canonicalServiceNamespace", required=true)
    private String canonicalServiceNamespace;

    /**
     * @return The namespace of the canonical service underlying this service.
     * Corresponds to the destination_canonical_service_namespace metric label in Istio metrics.
     * 
     */
    public String canonicalServiceNamespace() {
        return this.canonicalServiceNamespace;
    }

    /**
     * Identifier for the mesh in which this Istio service is defined.
     * Corresponds to the meshUid metric label in Istio metrics.
     * 
     */
    @Import(name="meshUid", required=true)
    private String meshUid;

    /**
     * @return Identifier for the mesh in which this Istio service is defined.
     * Corresponds to the meshUid metric label in Istio metrics.
     * 
     */
    public String meshUid() {
        return this.meshUid;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable String project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    private GetIstioCanonicalServiceArgs() {}

    private GetIstioCanonicalServiceArgs(GetIstioCanonicalServiceArgs $) {
        this.canonicalService = $.canonicalService;
        this.canonicalServiceNamespace = $.canonicalServiceNamespace;
        this.meshUid = $.meshUid;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetIstioCanonicalServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetIstioCanonicalServiceArgs $;

        public Builder() {
            $ = new GetIstioCanonicalServiceArgs();
        }

        public Builder(GetIstioCanonicalServiceArgs defaults) {
            $ = new GetIstioCanonicalServiceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param canonicalService The name of the canonical service underlying this service.
         * Corresponds to the destination_canonical_service_name metric label in label in Istio metrics.
         * 
         * @return builder
         * 
         */
        public Builder canonicalService(String canonicalService) {
            $.canonicalService = canonicalService;
            return this;
        }

        /**
         * @param canonicalServiceNamespace The namespace of the canonical service underlying this service.
         * Corresponds to the destination_canonical_service_namespace metric label in Istio metrics.
         * 
         * @return builder
         * 
         */
        public Builder canonicalServiceNamespace(String canonicalServiceNamespace) {
            $.canonicalServiceNamespace = canonicalServiceNamespace;
            return this;
        }

        /**
         * @param meshUid Identifier for the mesh in which this Istio service is defined.
         * Corresponds to the meshUid metric label in Istio metrics.
         * 
         * @return builder
         * 
         */
        public Builder meshUid(String meshUid) {
            $.meshUid = meshUid;
            return this;
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public GetIstioCanonicalServiceArgs build() {
            $.canonicalService = Objects.requireNonNull($.canonicalService, "expected parameter 'canonicalService' to be non-null");
            $.canonicalServiceNamespace = Objects.requireNonNull($.canonicalServiceNamespace, "expected parameter 'canonicalServiceNamespace' to be non-null");
            $.meshUid = Objects.requireNonNull($.meshUid, "expected parameter 'meshUid' to be non-null");
            return $;
        }
    }

}
