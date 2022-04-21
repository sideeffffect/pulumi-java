// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.securityinsights;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EyesOnArgs extends com.pulumi.resources.ResourceArgs {

    public static final EyesOnArgs Empty = new EyesOnArgs();

    /**
     * The kind of the setting
     * Expected value is &#39;EyesOn&#39;.
     * 
     */
    @Import(name="kind", required=true)
    private Output<String> kind;

    public Output<String> kind() {
        return this.kind;
    }

    /**
     * The namespace of workspaces resource provider- Microsoft.OperationalInsights.
     * 
     */
    @Import(name="operationalInsightsResourceProvider", required=true)
    private Output<String> operationalInsightsResourceProvider;

    public Output<String> operationalInsightsResourceProvider() {
        return this.operationalInsightsResourceProvider;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The setting name. Supports - Anomalies, EyesOn, EntityAnalytics, Ueba
     * 
     */
    @Import(name="settingsName")
    private @Nullable Output<String> settingsName;

    public Optional<Output<String>> settingsName() {
        return Optional.ofNullable(this.settingsName);
    }

    /**
     * The name of the workspace.
     * 
     */
    @Import(name="workspaceName", required=true)
    private Output<String> workspaceName;

    public Output<String> workspaceName() {
        return this.workspaceName;
    }

    private EyesOnArgs() {}

    private EyesOnArgs(EyesOnArgs $) {
        this.kind = $.kind;
        this.operationalInsightsResourceProvider = $.operationalInsightsResourceProvider;
        this.resourceGroupName = $.resourceGroupName;
        this.settingsName = $.settingsName;
        this.workspaceName = $.workspaceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EyesOnArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EyesOnArgs $;

        public Builder() {
            $ = new EyesOnArgs();
        }

        public Builder(EyesOnArgs defaults) {
            $ = new EyesOnArgs(Objects.requireNonNull(defaults));
        }

        public Builder kind(Output<String> kind) {
            $.kind = kind;
            return this;
        }

        public Builder kind(String kind) {
            return kind(Output.of(kind));
        }

        public Builder operationalInsightsResourceProvider(Output<String> operationalInsightsResourceProvider) {
            $.operationalInsightsResourceProvider = operationalInsightsResourceProvider;
            return this;
        }

        public Builder operationalInsightsResourceProvider(String operationalInsightsResourceProvider) {
            return operationalInsightsResourceProvider(Output.of(operationalInsightsResourceProvider));
        }

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public Builder settingsName(@Nullable Output<String> settingsName) {
            $.settingsName = settingsName;
            return this;
        }

        public Builder settingsName(String settingsName) {
            return settingsName(Output.of(settingsName));
        }

        public Builder workspaceName(Output<String> workspaceName) {
            $.workspaceName = workspaceName;
            return this;
        }

        public Builder workspaceName(String workspaceName) {
            return workspaceName(Output.of(workspaceName));
        }

        public EyesOnArgs build() {
            $.kind = Codegen.stringProp("kind").output().arg($.kind).require();
            $.operationalInsightsResourceProvider = Objects.requireNonNull($.operationalInsightsResourceProvider, "expected parameter 'operationalInsightsResourceProvider' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.workspaceName = Objects.requireNonNull($.workspaceName, "expected parameter 'workspaceName' to be non-null");
            return $;
        }
    }

}
