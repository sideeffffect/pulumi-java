// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningservices.inputs;

import com.pulumi.azurenative.machinelearningservices.inputs.ComputeInstanceResponseProperties;
import com.pulumi.azurenative.machinelearningservices.inputs.MachineLearningServiceErrorResponse;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * An Azure Machine Learning compute instance.
 * 
 */
public final class ComputeInstanceResponse extends com.pulumi.resources.InvokeArgs {

    public static final ComputeInstanceResponse Empty = new ComputeInstanceResponse();

    /**
     * Location for the underlying compute
     * 
     */
    @Import(name="computeLocation")
    private @Nullable String computeLocation;

    public Optional<String> computeLocation() {
        return Optional.ofNullable(this.computeLocation);
    }

    /**
     * The type of compute
     * Expected value is &#39;ComputeInstance&#39;.
     * 
     */
    @Import(name="computeType", required=true)
    private String computeType;

    public String computeType() {
        return this.computeType;
    }

    /**
     * The description of the Machine Learning compute.
     * 
     */
    @Import(name="description")
    private @Nullable String description;

    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Indicating whether the compute was provisioned by user and brought from outside if true, or machine learning service provisioned it if false.
     * 
     */
    @Import(name="isAttachedCompute", required=true)
    private Boolean isAttachedCompute;

    public Boolean isAttachedCompute() {
        return this.isAttachedCompute;
    }

    /**
     * Compute Instance properties
     * 
     */
    @Import(name="properties")
    private @Nullable ComputeInstanceResponseProperties properties;

    public Optional<ComputeInstanceResponseProperties> properties() {
        return Optional.ofNullable(this.properties);
    }

    /**
     * Errors during provisioning
     * 
     */
    @Import(name="provisioningErrors", required=true)
    private List<MachineLearningServiceErrorResponse> provisioningErrors;

    public List<MachineLearningServiceErrorResponse> provisioningErrors() {
        return this.provisioningErrors;
    }

    /**
     * The provision state of the cluster. Valid values are Unknown, Updating, Provisioning, Succeeded, and Failed.
     * 
     */
    @Import(name="provisioningState", required=true)
    private String provisioningState;

    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * ARM resource id of the underlying compute
     * 
     */
    @Import(name="resourceId")
    private @Nullable String resourceId;

    public Optional<String> resourceId() {
        return Optional.ofNullable(this.resourceId);
    }

    private ComputeInstanceResponse() {}

    private ComputeInstanceResponse(ComputeInstanceResponse $) {
        this.computeLocation = $.computeLocation;
        this.computeType = $.computeType;
        this.description = $.description;
        this.isAttachedCompute = $.isAttachedCompute;
        this.properties = $.properties;
        this.provisioningErrors = $.provisioningErrors;
        this.provisioningState = $.provisioningState;
        this.resourceId = $.resourceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ComputeInstanceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ComputeInstanceResponse $;

        public Builder() {
            $ = new ComputeInstanceResponse();
        }

        public Builder(ComputeInstanceResponse defaults) {
            $ = new ComputeInstanceResponse(Objects.requireNonNull(defaults));
        }

        public Builder computeLocation(@Nullable String computeLocation) {
            $.computeLocation = computeLocation;
            return this;
        }

        public Builder computeType(String computeType) {
            $.computeType = computeType;
            return this;
        }

        public Builder description(@Nullable String description) {
            $.description = description;
            return this;
        }

        public Builder isAttachedCompute(Boolean isAttachedCompute) {
            $.isAttachedCompute = isAttachedCompute;
            return this;
        }

        public Builder properties(@Nullable ComputeInstanceResponseProperties properties) {
            $.properties = properties;
            return this;
        }

        public Builder provisioningErrors(List<MachineLearningServiceErrorResponse> provisioningErrors) {
            $.provisioningErrors = provisioningErrors;
            return this;
        }

        public Builder provisioningErrors(MachineLearningServiceErrorResponse... provisioningErrors) {
            return provisioningErrors(List.of(provisioningErrors));
        }

        public Builder provisioningState(String provisioningState) {
            $.provisioningState = provisioningState;
            return this;
        }

        public Builder resourceId(@Nullable String resourceId) {
            $.resourceId = resourceId;
            return this;
        }

        public ComputeInstanceResponse build() {
            $.computeType = Codegen.stringProp("computeType").arg($.computeType).require();
            $.isAttachedCompute = Objects.requireNonNull($.isAttachedCompute, "expected parameter 'isAttachedCompute' to be non-null");
            $.provisioningErrors = Objects.requireNonNull($.provisioningErrors, "expected parameter 'provisioningErrors' to be non-null");
            $.provisioningState = Objects.requireNonNull($.provisioningState, "expected parameter 'provisioningState' to be non-null");
            return $;
        }
    }

}
