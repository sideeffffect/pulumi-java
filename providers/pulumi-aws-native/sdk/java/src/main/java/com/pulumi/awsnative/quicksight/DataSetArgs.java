// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.quicksight;

import com.pulumi.awsnative.quicksight.enums.DataSetImportMode;
import com.pulumi.awsnative.quicksight.inputs.DataSetColumnGroupArgs;
import com.pulumi.awsnative.quicksight.inputs.DataSetColumnLevelPermissionRuleArgs;
import com.pulumi.awsnative.quicksight.inputs.DataSetFieldFolderMapArgs;
import com.pulumi.awsnative.quicksight.inputs.DataSetIngestionWaitPolicyArgs;
import com.pulumi.awsnative.quicksight.inputs.DataSetLogicalTableMapArgs;
import com.pulumi.awsnative.quicksight.inputs.DataSetPhysicalTableMapArgs;
import com.pulumi.awsnative.quicksight.inputs.DataSetResourcePermissionArgs;
import com.pulumi.awsnative.quicksight.inputs.DataSetRowLevelPermissionDataSetArgs;
import com.pulumi.awsnative.quicksight.inputs.DataSetTagArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DataSetArgs extends com.pulumi.resources.ResourceArgs {

    public static final DataSetArgs Empty = new DataSetArgs();

    @Import(name="awsAccountId")
    private @Nullable Output<String> awsAccountId;

    public Optional<Output<String>> awsAccountId() {
        return Optional.ofNullable(this.awsAccountId);
    }

    /**
     * &lt;p&gt;Groupings of columns that work together in certain QuickSight features. Currently, only geospatial hierarchy is supported.&lt;/p&gt;
     * 
     */
    @Import(name="columnGroups")
    private @Nullable Output<List<DataSetColumnGroupArgs>> columnGroups;

    public Optional<Output<List<DataSetColumnGroupArgs>>> columnGroups() {
        return Optional.ofNullable(this.columnGroups);
    }

    @Import(name="columnLevelPermissionRules")
    private @Nullable Output<List<DataSetColumnLevelPermissionRuleArgs>> columnLevelPermissionRules;

    public Optional<Output<List<DataSetColumnLevelPermissionRuleArgs>>> columnLevelPermissionRules() {
        return Optional.ofNullable(this.columnLevelPermissionRules);
    }

    @Import(name="dataSetId")
    private @Nullable Output<String> dataSetId;

    public Optional<Output<String>> dataSetId() {
        return Optional.ofNullable(this.dataSetId);
    }

    @Import(name="fieldFolders")
    private @Nullable Output<DataSetFieldFolderMapArgs> fieldFolders;

    public Optional<Output<DataSetFieldFolderMapArgs>> fieldFolders() {
        return Optional.ofNullable(this.fieldFolders);
    }

    @Import(name="importMode")
    private @Nullable Output<DataSetImportMode> importMode;

    public Optional<Output<DataSetImportMode>> importMode() {
        return Optional.ofNullable(this.importMode);
    }

    @Import(name="ingestionWaitPolicy")
    private @Nullable Output<DataSetIngestionWaitPolicyArgs> ingestionWaitPolicy;

    public Optional<Output<DataSetIngestionWaitPolicyArgs>> ingestionWaitPolicy() {
        return Optional.ofNullable(this.ingestionWaitPolicy);
    }

    @Import(name="logicalTableMap")
    private @Nullable Output<DataSetLogicalTableMapArgs> logicalTableMap;

    public Optional<Output<DataSetLogicalTableMapArgs>> logicalTableMap() {
        return Optional.ofNullable(this.logicalTableMap);
    }

    /**
     * &lt;p&gt;The display name for the dataset.&lt;/p&gt;
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * &lt;p&gt;A list of resource permissions on the dataset.&lt;/p&gt;
     * 
     */
    @Import(name="permissions")
    private @Nullable Output<List<DataSetResourcePermissionArgs>> permissions;

    public Optional<Output<List<DataSetResourcePermissionArgs>>> permissions() {
        return Optional.ofNullable(this.permissions);
    }

    @Import(name="physicalTableMap")
    private @Nullable Output<DataSetPhysicalTableMapArgs> physicalTableMap;

    public Optional<Output<DataSetPhysicalTableMapArgs>> physicalTableMap() {
        return Optional.ofNullable(this.physicalTableMap);
    }

    @Import(name="rowLevelPermissionDataSet")
    private @Nullable Output<DataSetRowLevelPermissionDataSetArgs> rowLevelPermissionDataSet;

    public Optional<Output<DataSetRowLevelPermissionDataSetArgs>> rowLevelPermissionDataSet() {
        return Optional.ofNullable(this.rowLevelPermissionDataSet);
    }

    /**
     * &lt;p&gt;Contains a map of the key-value pairs for the resource tag or tags assigned to the dataset.&lt;/p&gt;
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<DataSetTagArgs>> tags;

    public Optional<Output<List<DataSetTagArgs>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private DataSetArgs() {}

    private DataSetArgs(DataSetArgs $) {
        this.awsAccountId = $.awsAccountId;
        this.columnGroups = $.columnGroups;
        this.columnLevelPermissionRules = $.columnLevelPermissionRules;
        this.dataSetId = $.dataSetId;
        this.fieldFolders = $.fieldFolders;
        this.importMode = $.importMode;
        this.ingestionWaitPolicy = $.ingestionWaitPolicy;
        this.logicalTableMap = $.logicalTableMap;
        this.name = $.name;
        this.permissions = $.permissions;
        this.physicalTableMap = $.physicalTableMap;
        this.rowLevelPermissionDataSet = $.rowLevelPermissionDataSet;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DataSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataSetArgs $;

        public Builder() {
            $ = new DataSetArgs();
        }

        public Builder(DataSetArgs defaults) {
            $ = new DataSetArgs(Objects.requireNonNull(defaults));
        }

        public Builder awsAccountId(@Nullable Output<String> awsAccountId) {
            $.awsAccountId = awsAccountId;
            return this;
        }

        public Builder awsAccountId(String awsAccountId) {
            return awsAccountId(Output.of(awsAccountId));
        }

        public Builder columnGroups(@Nullable Output<List<DataSetColumnGroupArgs>> columnGroups) {
            $.columnGroups = columnGroups;
            return this;
        }

        public Builder columnGroups(List<DataSetColumnGroupArgs> columnGroups) {
            return columnGroups(Output.of(columnGroups));
        }

        public Builder columnGroups(DataSetColumnGroupArgs... columnGroups) {
            return columnGroups(List.of(columnGroups));
        }

        public Builder columnLevelPermissionRules(@Nullable Output<List<DataSetColumnLevelPermissionRuleArgs>> columnLevelPermissionRules) {
            $.columnLevelPermissionRules = columnLevelPermissionRules;
            return this;
        }

        public Builder columnLevelPermissionRules(List<DataSetColumnLevelPermissionRuleArgs> columnLevelPermissionRules) {
            return columnLevelPermissionRules(Output.of(columnLevelPermissionRules));
        }

        public Builder columnLevelPermissionRules(DataSetColumnLevelPermissionRuleArgs... columnLevelPermissionRules) {
            return columnLevelPermissionRules(List.of(columnLevelPermissionRules));
        }

        public Builder dataSetId(@Nullable Output<String> dataSetId) {
            $.dataSetId = dataSetId;
            return this;
        }

        public Builder dataSetId(String dataSetId) {
            return dataSetId(Output.of(dataSetId));
        }

        public Builder fieldFolders(@Nullable Output<DataSetFieldFolderMapArgs> fieldFolders) {
            $.fieldFolders = fieldFolders;
            return this;
        }

        public Builder fieldFolders(DataSetFieldFolderMapArgs fieldFolders) {
            return fieldFolders(Output.of(fieldFolders));
        }

        public Builder importMode(@Nullable Output<DataSetImportMode> importMode) {
            $.importMode = importMode;
            return this;
        }

        public Builder importMode(DataSetImportMode importMode) {
            return importMode(Output.of(importMode));
        }

        public Builder ingestionWaitPolicy(@Nullable Output<DataSetIngestionWaitPolicyArgs> ingestionWaitPolicy) {
            $.ingestionWaitPolicy = ingestionWaitPolicy;
            return this;
        }

        public Builder ingestionWaitPolicy(DataSetIngestionWaitPolicyArgs ingestionWaitPolicy) {
            return ingestionWaitPolicy(Output.of(ingestionWaitPolicy));
        }

        public Builder logicalTableMap(@Nullable Output<DataSetLogicalTableMapArgs> logicalTableMap) {
            $.logicalTableMap = logicalTableMap;
            return this;
        }

        public Builder logicalTableMap(DataSetLogicalTableMapArgs logicalTableMap) {
            return logicalTableMap(Output.of(logicalTableMap));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder permissions(@Nullable Output<List<DataSetResourcePermissionArgs>> permissions) {
            $.permissions = permissions;
            return this;
        }

        public Builder permissions(List<DataSetResourcePermissionArgs> permissions) {
            return permissions(Output.of(permissions));
        }

        public Builder permissions(DataSetResourcePermissionArgs... permissions) {
            return permissions(List.of(permissions));
        }

        public Builder physicalTableMap(@Nullable Output<DataSetPhysicalTableMapArgs> physicalTableMap) {
            $.physicalTableMap = physicalTableMap;
            return this;
        }

        public Builder physicalTableMap(DataSetPhysicalTableMapArgs physicalTableMap) {
            return physicalTableMap(Output.of(physicalTableMap));
        }

        public Builder rowLevelPermissionDataSet(@Nullable Output<DataSetRowLevelPermissionDataSetArgs> rowLevelPermissionDataSet) {
            $.rowLevelPermissionDataSet = rowLevelPermissionDataSet;
            return this;
        }

        public Builder rowLevelPermissionDataSet(DataSetRowLevelPermissionDataSetArgs rowLevelPermissionDataSet) {
            return rowLevelPermissionDataSet(Output.of(rowLevelPermissionDataSet));
        }

        public Builder tags(@Nullable Output<List<DataSetTagArgs>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(List<DataSetTagArgs> tags) {
            return tags(Output.of(tags));
        }

        public Builder tags(DataSetTagArgs... tags) {
            return tags(List.of(tags));
        }

        public DataSetArgs build() {
            return $;
        }
    }

}
