// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ssm.inputs;

import io.pulumi.aws.ssm.inputs.PatchBaselineApprovalRuleGetArgs;
import io.pulumi.aws.ssm.inputs.PatchBaselineGlobalFilterGetArgs;
import io.pulumi.aws.ssm.inputs.PatchBaselineSourceGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PatchBaselineState extends io.pulumi.resources.ResourceArgs {

    public static final PatchBaselineState Empty = new PatchBaselineState();

    /**
     * A set of rules used to include patches in the baseline. up to 10 approval rules can be specified. Each approval_rule block requires the fields documented below.
     * 
     */
    @InputImport(name="approvalRules")
      private final @Nullable Input<List<PatchBaselineApprovalRuleGetArgs>> approvalRules;

    public Input<List<PatchBaselineApprovalRuleGetArgs>> getApprovalRules() {
        return this.approvalRules == null ? Input.empty() : this.approvalRules;
    }

    /**
     * A list of explicitly approved patches for the baseline.
     * 
     */
    @InputImport(name="approvedPatches")
      private final @Nullable Input<List<String>> approvedPatches;

    public Input<List<String>> getApprovedPatches() {
        return this.approvedPatches == null ? Input.empty() : this.approvedPatches;
    }

    /**
     * Defines the compliance level for approved patches. This means that if an approved patch is reported as missing, this is the severity of the compliance violation. Valid compliance levels include the following: `CRITICAL`, `HIGH`, `MEDIUM`, `LOW`, `INFORMATIONAL`, `UNSPECIFIED`. The default value is `UNSPECIFIED`.
     * 
     */
    @InputImport(name="approvedPatchesComplianceLevel")
      private final @Nullable Input<String> approvedPatchesComplianceLevel;

    public Input<String> getApprovedPatchesComplianceLevel() {
        return this.approvedPatchesComplianceLevel == null ? Input.empty() : this.approvedPatchesComplianceLevel;
    }

    /**
     * Indicates whether the list of approved patches includes non-security updates that should be applied to the instances. Applies to Linux instances only.
     * 
     */
    @InputImport(name="approvedPatchesEnableNonSecurity")
      private final @Nullable Input<Boolean> approvedPatchesEnableNonSecurity;

    public Input<Boolean> getApprovedPatchesEnableNonSecurity() {
        return this.approvedPatchesEnableNonSecurity == null ? Input.empty() : this.approvedPatchesEnableNonSecurity;
    }

    /**
     * The ARN of the patch baseline.
     * 
     */
    @InputImport(name="arn")
      private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    /**
     * The description of the patch baseline.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * A set of global filters used to exclude patches from the baseline. Up to 4 global filters can be specified using Key/Value pairs. Valid Keys are `PRODUCT | CLASSIFICATION | MSRC_SEVERITY | PATCH_ID`.
     * 
     */
    @InputImport(name="globalFilters")
      private final @Nullable Input<List<PatchBaselineGlobalFilterGetArgs>> globalFilters;

    public Input<List<PatchBaselineGlobalFilterGetArgs>> getGlobalFilters() {
        return this.globalFilters == null ? Input.empty() : this.globalFilters;
    }

    /**
     * The name specified to identify the patch source.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Defines the operating system the patch baseline applies to. Supported operating systems include `WINDOWS`, `AMAZON_LINUX`, `AMAZON_LINUX_2`, `SUSE`, `UBUNTU`, `CENTOS`, and `REDHAT_ENTERPRISE_LINUX`. The Default value is `WINDOWS`.
     * 
     */
    @InputImport(name="operatingSystem")
      private final @Nullable Input<String> operatingSystem;

    public Input<String> getOperatingSystem() {
        return this.operatingSystem == null ? Input.empty() : this.operatingSystem;
    }

    /**
     * A list of rejected patches.
     * 
     */
    @InputImport(name="rejectedPatches")
      private final @Nullable Input<List<String>> rejectedPatches;

    public Input<List<String>> getRejectedPatches() {
        return this.rejectedPatches == null ? Input.empty() : this.rejectedPatches;
    }

    /**
     * The action for Patch Manager to take on patches included in the `rejected_patches` list. Allow values are `ALLOW_AS_DEPENDENCY` and `BLOCK`.
     * 
     */
    @InputImport(name="rejectedPatchesAction")
      private final @Nullable Input<String> rejectedPatchesAction;

    public Input<String> getRejectedPatchesAction() {
        return this.rejectedPatchesAction == null ? Input.empty() : this.rejectedPatchesAction;
    }

    /**
     * Configuration block(s) with alternate sources for patches. Applies to Linux instances only. Documented below.
     * 
     */
    @InputImport(name="sources")
      private final @Nullable Input<List<PatchBaselineSourceGetArgs>> sources;

    public Input<List<PatchBaselineSourceGetArgs>> getSources() {
        return this.sources == null ? Input.empty() : this.sources;
    }

    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @InputImport(name="tagsAll")
      private final @Nullable Input<Map<String,String>> tagsAll;

    public Input<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Input.empty() : this.tagsAll;
    }

    public PatchBaselineState(
        @Nullable Input<List<PatchBaselineApprovalRuleGetArgs>> approvalRules,
        @Nullable Input<List<String>> approvedPatches,
        @Nullable Input<String> approvedPatchesComplianceLevel,
        @Nullable Input<Boolean> approvedPatchesEnableNonSecurity,
        @Nullable Input<String> arn,
        @Nullable Input<String> description,
        @Nullable Input<List<PatchBaselineGlobalFilterGetArgs>> globalFilters,
        @Nullable Input<String> name,
        @Nullable Input<String> operatingSystem,
        @Nullable Input<List<String>> rejectedPatches,
        @Nullable Input<String> rejectedPatchesAction,
        @Nullable Input<List<PatchBaselineSourceGetArgs>> sources,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<Map<String,String>> tagsAll) {
        this.approvalRules = approvalRules;
        this.approvedPatches = approvedPatches;
        this.approvedPatchesComplianceLevel = approvedPatchesComplianceLevel;
        this.approvedPatchesEnableNonSecurity = approvedPatchesEnableNonSecurity;
        this.arn = arn;
        this.description = description;
        this.globalFilters = globalFilters;
        this.name = name;
        this.operatingSystem = operatingSystem;
        this.rejectedPatches = rejectedPatches;
        this.rejectedPatchesAction = rejectedPatchesAction;
        this.sources = sources;
        this.tags = tags;
        this.tagsAll = tagsAll;
    }

    private PatchBaselineState() {
        this.approvalRules = Input.empty();
        this.approvedPatches = Input.empty();
        this.approvedPatchesComplianceLevel = Input.empty();
        this.approvedPatchesEnableNonSecurity = Input.empty();
        this.arn = Input.empty();
        this.description = Input.empty();
        this.globalFilters = Input.empty();
        this.name = Input.empty();
        this.operatingSystem = Input.empty();
        this.rejectedPatches = Input.empty();
        this.rejectedPatchesAction = Input.empty();
        this.sources = Input.empty();
        this.tags = Input.empty();
        this.tagsAll = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PatchBaselineState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<PatchBaselineApprovalRuleGetArgs>> approvalRules;
        private @Nullable Input<List<String>> approvedPatches;
        private @Nullable Input<String> approvedPatchesComplianceLevel;
        private @Nullable Input<Boolean> approvedPatchesEnableNonSecurity;
        private @Nullable Input<String> arn;
        private @Nullable Input<String> description;
        private @Nullable Input<List<PatchBaselineGlobalFilterGetArgs>> globalFilters;
        private @Nullable Input<String> name;
        private @Nullable Input<String> operatingSystem;
        private @Nullable Input<List<String>> rejectedPatches;
        private @Nullable Input<String> rejectedPatchesAction;
        private @Nullable Input<List<PatchBaselineSourceGetArgs>> sources;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<Map<String,String>> tagsAll;

        public Builder() {
    	      // Empty
        }

        public Builder(PatchBaselineState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.approvalRules = defaults.approvalRules;
    	      this.approvedPatches = defaults.approvedPatches;
    	      this.approvedPatchesComplianceLevel = defaults.approvedPatchesComplianceLevel;
    	      this.approvedPatchesEnableNonSecurity = defaults.approvedPatchesEnableNonSecurity;
    	      this.arn = defaults.arn;
    	      this.description = defaults.description;
    	      this.globalFilters = defaults.globalFilters;
    	      this.name = defaults.name;
    	      this.operatingSystem = defaults.operatingSystem;
    	      this.rejectedPatches = defaults.rejectedPatches;
    	      this.rejectedPatchesAction = defaults.rejectedPatchesAction;
    	      this.sources = defaults.sources;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
        }

        public Builder approvalRules(@Nullable Input<List<PatchBaselineApprovalRuleGetArgs>> approvalRules) {
            this.approvalRules = approvalRules;
            return this;
        }

        public Builder approvalRules(@Nullable List<PatchBaselineApprovalRuleGetArgs> approvalRules) {
            this.approvalRules = Input.ofNullable(approvalRules);
            return this;
        }

        public Builder approvedPatches(@Nullable Input<List<String>> approvedPatches) {
            this.approvedPatches = approvedPatches;
            return this;
        }

        public Builder approvedPatches(@Nullable List<String> approvedPatches) {
            this.approvedPatches = Input.ofNullable(approvedPatches);
            return this;
        }

        public Builder approvedPatchesComplianceLevel(@Nullable Input<String> approvedPatchesComplianceLevel) {
            this.approvedPatchesComplianceLevel = approvedPatchesComplianceLevel;
            return this;
        }

        public Builder approvedPatchesComplianceLevel(@Nullable String approvedPatchesComplianceLevel) {
            this.approvedPatchesComplianceLevel = Input.ofNullable(approvedPatchesComplianceLevel);
            return this;
        }

        public Builder approvedPatchesEnableNonSecurity(@Nullable Input<Boolean> approvedPatchesEnableNonSecurity) {
            this.approvedPatchesEnableNonSecurity = approvedPatchesEnableNonSecurity;
            return this;
        }

        public Builder approvedPatchesEnableNonSecurity(@Nullable Boolean approvedPatchesEnableNonSecurity) {
            this.approvedPatchesEnableNonSecurity = Input.ofNullable(approvedPatchesEnableNonSecurity);
            return this;
        }

        public Builder arn(@Nullable Input<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = Input.ofNullable(arn);
            return this;
        }

        public Builder description(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder globalFilters(@Nullable Input<List<PatchBaselineGlobalFilterGetArgs>> globalFilters) {
            this.globalFilters = globalFilters;
            return this;
        }

        public Builder globalFilters(@Nullable List<PatchBaselineGlobalFilterGetArgs> globalFilters) {
            this.globalFilters = Input.ofNullable(globalFilters);
            return this;
        }

        public Builder name(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder operatingSystem(@Nullable Input<String> operatingSystem) {
            this.operatingSystem = operatingSystem;
            return this;
        }

        public Builder operatingSystem(@Nullable String operatingSystem) {
            this.operatingSystem = Input.ofNullable(operatingSystem);
            return this;
        }

        public Builder rejectedPatches(@Nullable Input<List<String>> rejectedPatches) {
            this.rejectedPatches = rejectedPatches;
            return this;
        }

        public Builder rejectedPatches(@Nullable List<String> rejectedPatches) {
            this.rejectedPatches = Input.ofNullable(rejectedPatches);
            return this;
        }

        public Builder rejectedPatchesAction(@Nullable Input<String> rejectedPatchesAction) {
            this.rejectedPatchesAction = rejectedPatchesAction;
            return this;
        }

        public Builder rejectedPatchesAction(@Nullable String rejectedPatchesAction) {
            this.rejectedPatchesAction = Input.ofNullable(rejectedPatchesAction);
            return this;
        }

        public Builder sources(@Nullable Input<List<PatchBaselineSourceGetArgs>> sources) {
            this.sources = sources;
            return this;
        }

        public Builder sources(@Nullable List<PatchBaselineSourceGetArgs> sources) {
            this.sources = Input.ofNullable(sources);
            return this;
        }

        public Builder tags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder tagsAll(@Nullable Input<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }

        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Input.ofNullable(tagsAll);
            return this;
        }
        public PatchBaselineState build() {
            return new PatchBaselineState(approvalRules, approvedPatches, approvedPatchesComplianceLevel, approvedPatchesEnableNonSecurity, arn, description, globalFilters, name, operatingSystem, rejectedPatches, rejectedPatchesAction, sources, tags, tagsAll);
        }
    }
}
