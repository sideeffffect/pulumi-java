// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.vmmigration.v1alpha1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.vmmigration.v1alpha1.inputs.ComputeEngineTargetDefaultsArgs;
import com.pulumi.googlenative.vmmigration.v1alpha1.inputs.SchedulePolicyArgs;
import com.pulumi.googlenative.vmmigration.v1alpha1.inputs.TargetVMDetailsArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MigratingVmArgs extends com.pulumi.resources.ResourceArgs {

    public static final MigratingVmArgs Empty = new MigratingVmArgs();

    /**
     * Details of the target VM in Compute Engine.
     * 
     */
    @Import(name="computeEngineTargetDefaults")
    private @Nullable Output<ComputeEngineTargetDefaultsArgs> computeEngineTargetDefaults;

    /**
     * @return Details of the target VM in Compute Engine.
     * 
     */
    public Optional<Output<ComputeEngineTargetDefaultsArgs>> computeEngineTargetDefaults() {
        return Optional.ofNullable(this.computeEngineTargetDefaults);
    }

    /**
     * Details of the VM in Compute Engine. Deprecated: Use compute_engine_target_defaults instead.
     * 
     * @deprecated
     * Details of the VM in Compute Engine. Deprecated: Use compute_engine_target_defaults instead.
     * 
     */
    @Deprecated /* Details of the VM in Compute Engine. Deprecated: Use compute_engine_target_defaults instead. */
    @Import(name="computeEngineVmDefaults")
    private @Nullable Output<TargetVMDetailsArgs> computeEngineVmDefaults;

    /**
     * @return Details of the VM in Compute Engine. Deprecated: Use compute_engine_target_defaults instead.
     * 
     * @deprecated
     * Details of the VM in Compute Engine. Deprecated: Use compute_engine_target_defaults instead.
     * 
     */
    @Deprecated /* Details of the VM in Compute Engine. Deprecated: Use compute_engine_target_defaults instead. */
    public Optional<Output<TargetVMDetailsArgs>> computeEngineVmDefaults() {
        return Optional.ofNullable(this.computeEngineVmDefaults);
    }

    /**
     * The description attached to the migrating VM by the user.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description attached to the migrating VM by the user.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The display name attached to the MigratingVm by the user.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return The display name attached to the MigratingVm by the user.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * The labels of the migrating VM.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return The labels of the migrating VM.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Required. The migratingVm identifier.
     * 
     */
    @Import(name="migratingVmId", required=true)
    private Output<String> migratingVmId;

    /**
     * @return Required. The migratingVm identifier.
     * 
     */
    public Output<String> migratingVmId() {
        return this.migratingVmId;
    }

    /**
     * The replication schedule policy.
     * 
     */
    @Import(name="policy")
    private @Nullable Output<SchedulePolicyArgs> policy;

    /**
     * @return The replication schedule policy.
     * 
     */
    public Optional<Output<SchedulePolicyArgs>> policy() {
        return Optional.ofNullable(this.policy);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * A request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and t he request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
     * 
     */
    @Import(name="requestId")
    private @Nullable Output<String> requestId;

    /**
     * @return A request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and t he request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
     * 
     */
    public Optional<Output<String>> requestId() {
        return Optional.ofNullable(this.requestId);
    }

    @Import(name="sourceId", required=true)
    private Output<String> sourceId;

    public Output<String> sourceId() {
        return this.sourceId;
    }

    /**
     * The unique ID of the VM in the source. The VM&#39;s name in vSphere can be changed, so this is not the VM&#39;s name but rather its moRef id. This id is of the form vm-.
     * 
     */
    @Import(name="sourceVmId")
    private @Nullable Output<String> sourceVmId;

    /**
     * @return The unique ID of the VM in the source. The VM&#39;s name in vSphere can be changed, so this is not the VM&#39;s name but rather its moRef id. This id is of the form vm-.
     * 
     */
    public Optional<Output<String>> sourceVmId() {
        return Optional.ofNullable(this.sourceVmId);
    }

    /**
     * The default configuration of the target VM that will be created in GCP as a result of the migration. Deprecated: Use compute_engine_target_defaults instead.
     * 
     * @deprecated
     * The default configuration of the target VM that will be created in GCP as a result of the migration. Deprecated: Use compute_engine_target_defaults instead.
     * 
     */
    @Deprecated /* The default configuration of the target VM that will be created in GCP as a result of the migration. Deprecated: Use compute_engine_target_defaults instead. */
    @Import(name="targetDefaults")
    private @Nullable Output<TargetVMDetailsArgs> targetDefaults;

    /**
     * @return The default configuration of the target VM that will be created in GCP as a result of the migration. Deprecated: Use compute_engine_target_defaults instead.
     * 
     * @deprecated
     * The default configuration of the target VM that will be created in GCP as a result of the migration. Deprecated: Use compute_engine_target_defaults instead.
     * 
     */
    @Deprecated /* The default configuration of the target VM that will be created in GCP as a result of the migration. Deprecated: Use compute_engine_target_defaults instead. */
    public Optional<Output<TargetVMDetailsArgs>> targetDefaults() {
        return Optional.ofNullable(this.targetDefaults);
    }

    private MigratingVmArgs() {}

    private MigratingVmArgs(MigratingVmArgs $) {
        this.computeEngineTargetDefaults = $.computeEngineTargetDefaults;
        this.computeEngineVmDefaults = $.computeEngineVmDefaults;
        this.description = $.description;
        this.displayName = $.displayName;
        this.labels = $.labels;
        this.location = $.location;
        this.migratingVmId = $.migratingVmId;
        this.policy = $.policy;
        this.project = $.project;
        this.requestId = $.requestId;
        this.sourceId = $.sourceId;
        this.sourceVmId = $.sourceVmId;
        this.targetDefaults = $.targetDefaults;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MigratingVmArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MigratingVmArgs $;

        public Builder() {
            $ = new MigratingVmArgs();
        }

        public Builder(MigratingVmArgs defaults) {
            $ = new MigratingVmArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param computeEngineTargetDefaults Details of the target VM in Compute Engine.
         * 
         * @return builder
         * 
         */
        public Builder computeEngineTargetDefaults(@Nullable Output<ComputeEngineTargetDefaultsArgs> computeEngineTargetDefaults) {
            $.computeEngineTargetDefaults = computeEngineTargetDefaults;
            return this;
        }

        /**
         * @param computeEngineTargetDefaults Details of the target VM in Compute Engine.
         * 
         * @return builder
         * 
         */
        public Builder computeEngineTargetDefaults(ComputeEngineTargetDefaultsArgs computeEngineTargetDefaults) {
            return computeEngineTargetDefaults(Output.of(computeEngineTargetDefaults));
        }

        /**
         * @param computeEngineVmDefaults Details of the VM in Compute Engine. Deprecated: Use compute_engine_target_defaults instead.
         * 
         * @return builder
         * 
         * @deprecated
         * Details of the VM in Compute Engine. Deprecated: Use compute_engine_target_defaults instead.
         * 
         */
        @Deprecated /* Details of the VM in Compute Engine. Deprecated: Use compute_engine_target_defaults instead. */
        public Builder computeEngineVmDefaults(@Nullable Output<TargetVMDetailsArgs> computeEngineVmDefaults) {
            $.computeEngineVmDefaults = computeEngineVmDefaults;
            return this;
        }

        /**
         * @param computeEngineVmDefaults Details of the VM in Compute Engine. Deprecated: Use compute_engine_target_defaults instead.
         * 
         * @return builder
         * 
         * @deprecated
         * Details of the VM in Compute Engine. Deprecated: Use compute_engine_target_defaults instead.
         * 
         */
        @Deprecated /* Details of the VM in Compute Engine. Deprecated: Use compute_engine_target_defaults instead. */
        public Builder computeEngineVmDefaults(TargetVMDetailsArgs computeEngineVmDefaults) {
            return computeEngineVmDefaults(Output.of(computeEngineVmDefaults));
        }

        /**
         * @param description The description attached to the migrating VM by the user.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description attached to the migrating VM by the user.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param displayName The display name attached to the MigratingVm by the user.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName The display name attached to the MigratingVm by the user.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param labels The labels of the migrating VM.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels The labels of the migrating VM.
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param migratingVmId Required. The migratingVm identifier.
         * 
         * @return builder
         * 
         */
        public Builder migratingVmId(Output<String> migratingVmId) {
            $.migratingVmId = migratingVmId;
            return this;
        }

        /**
         * @param migratingVmId Required. The migratingVm identifier.
         * 
         * @return builder
         * 
         */
        public Builder migratingVmId(String migratingVmId) {
            return migratingVmId(Output.of(migratingVmId));
        }

        /**
         * @param policy The replication schedule policy.
         * 
         * @return builder
         * 
         */
        public Builder policy(@Nullable Output<SchedulePolicyArgs> policy) {
            $.policy = policy;
            return this;
        }

        /**
         * @param policy The replication schedule policy.
         * 
         * @return builder
         * 
         */
        public Builder policy(SchedulePolicyArgs policy) {
            return policy(Output.of(policy));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param requestId A request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and t he request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
         * 
         * @return builder
         * 
         */
        public Builder requestId(@Nullable Output<String> requestId) {
            $.requestId = requestId;
            return this;
        }

        /**
         * @param requestId A request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and t he request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
         * 
         * @return builder
         * 
         */
        public Builder requestId(String requestId) {
            return requestId(Output.of(requestId));
        }

        public Builder sourceId(Output<String> sourceId) {
            $.sourceId = sourceId;
            return this;
        }

        public Builder sourceId(String sourceId) {
            return sourceId(Output.of(sourceId));
        }

        /**
         * @param sourceVmId The unique ID of the VM in the source. The VM&#39;s name in vSphere can be changed, so this is not the VM&#39;s name but rather its moRef id. This id is of the form vm-.
         * 
         * @return builder
         * 
         */
        public Builder sourceVmId(@Nullable Output<String> sourceVmId) {
            $.sourceVmId = sourceVmId;
            return this;
        }

        /**
         * @param sourceVmId The unique ID of the VM in the source. The VM&#39;s name in vSphere can be changed, so this is not the VM&#39;s name but rather its moRef id. This id is of the form vm-.
         * 
         * @return builder
         * 
         */
        public Builder sourceVmId(String sourceVmId) {
            return sourceVmId(Output.of(sourceVmId));
        }

        /**
         * @param targetDefaults The default configuration of the target VM that will be created in GCP as a result of the migration. Deprecated: Use compute_engine_target_defaults instead.
         * 
         * @return builder
         * 
         * @deprecated
         * The default configuration of the target VM that will be created in GCP as a result of the migration. Deprecated: Use compute_engine_target_defaults instead.
         * 
         */
        @Deprecated /* The default configuration of the target VM that will be created in GCP as a result of the migration. Deprecated: Use compute_engine_target_defaults instead. */
        public Builder targetDefaults(@Nullable Output<TargetVMDetailsArgs> targetDefaults) {
            $.targetDefaults = targetDefaults;
            return this;
        }

        /**
         * @param targetDefaults The default configuration of the target VM that will be created in GCP as a result of the migration. Deprecated: Use compute_engine_target_defaults instead.
         * 
         * @return builder
         * 
         * @deprecated
         * The default configuration of the target VM that will be created in GCP as a result of the migration. Deprecated: Use compute_engine_target_defaults instead.
         * 
         */
        @Deprecated /* The default configuration of the target VM that will be created in GCP as a result of the migration. Deprecated: Use compute_engine_target_defaults instead. */
        public Builder targetDefaults(TargetVMDetailsArgs targetDefaults) {
            return targetDefaults(Output.of(targetDefaults));
        }

        public MigratingVmArgs build() {
            $.migratingVmId = Objects.requireNonNull($.migratingVmId, "expected parameter 'migratingVmId' to be non-null");
            $.sourceId = Objects.requireNonNull($.sourceId, "expected parameter 'sourceId' to be non-null");
            return $;
        }
    }

}
