// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.quicksight.outputs;

import io.pulumi.awsnative.quicksight.enums.DataSetImportMode;
import io.pulumi.awsnative.quicksight.outputs.DataSetColumnGroup;
import io.pulumi.awsnative.quicksight.outputs.DataSetColumnLevelPermissionRule;
import io.pulumi.awsnative.quicksight.outputs.DataSetLogicalTableMap;
import io.pulumi.awsnative.quicksight.outputs.DataSetOutputColumn;
import io.pulumi.awsnative.quicksight.outputs.DataSetPhysicalTableMap;
import io.pulumi.awsnative.quicksight.outputs.DataSetResourcePermission;
import io.pulumi.awsnative.quicksight.outputs.DataSetRowLevelPermissionDataSet;
import io.pulumi.awsnative.quicksight.outputs.DataSetTag;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetDataSetResult {
    /**
     * <p>The Amazon Resource Name (ARN) of the resource.</p>
     * 
     */
    private final @Nullable String arn;
    /**
     * <p>Groupings of columns that work together in certain QuickSight features. Currently, only geospatial hierarchy is supported.</p>
     * 
     */
    private final @Nullable List<DataSetColumnGroup> columnGroups;
    private final @Nullable List<DataSetColumnLevelPermissionRule> columnLevelPermissionRules;
    /**
     * <p>The amount of SPICE capacity used by this dataset. This is 0 if the dataset isn't
     *             imported into SPICE.</p>
     * 
     */
    private final @Nullable Double consumedSpiceCapacityInBytes;
    /**
     * <p>The time that this dataset was created.</p>
     * 
     */
    private final @Nullable String createdTime;
    private final @Nullable DataSetImportMode importMode;
    /**
     * <p>The last time that this dataset was updated.</p>
     * 
     */
    private final @Nullable String lastUpdatedTime;
    private final @Nullable DataSetLogicalTableMap logicalTableMap;
    /**
     * <p>The display name for the dataset.</p>
     * 
     */
    private final @Nullable String name;
    /**
     * <p>The list of columns after all transforms. These columns are available in templates,
     *             analyses, and dashboards.</p>
     * 
     */
    private final @Nullable List<DataSetOutputColumn> outputColumns;
    /**
     * <p>A list of resource permissions on the dataset.</p>
     * 
     */
    private final @Nullable List<DataSetResourcePermission> permissions;
    private final @Nullable DataSetPhysicalTableMap physicalTableMap;
    private final @Nullable DataSetRowLevelPermissionDataSet rowLevelPermissionDataSet;
    /**
     * <p>Contains a map of the key-value pairs for the resource tag or tags assigned to the dataset.</p>
     * 
     */
    private final @Nullable List<DataSetTag> tags;

    @OutputCustomType.Constructor
    private GetDataSetResult(
        @OutputCustomType.Parameter("arn") @Nullable String arn,
        @OutputCustomType.Parameter("columnGroups") @Nullable List<DataSetColumnGroup> columnGroups,
        @OutputCustomType.Parameter("columnLevelPermissionRules") @Nullable List<DataSetColumnLevelPermissionRule> columnLevelPermissionRules,
        @OutputCustomType.Parameter("consumedSpiceCapacityInBytes") @Nullable Double consumedSpiceCapacityInBytes,
        @OutputCustomType.Parameter("createdTime") @Nullable String createdTime,
        @OutputCustomType.Parameter("importMode") @Nullable DataSetImportMode importMode,
        @OutputCustomType.Parameter("lastUpdatedTime") @Nullable String lastUpdatedTime,
        @OutputCustomType.Parameter("logicalTableMap") @Nullable DataSetLogicalTableMap logicalTableMap,
        @OutputCustomType.Parameter("name") @Nullable String name,
        @OutputCustomType.Parameter("outputColumns") @Nullable List<DataSetOutputColumn> outputColumns,
        @OutputCustomType.Parameter("permissions") @Nullable List<DataSetResourcePermission> permissions,
        @OutputCustomType.Parameter("physicalTableMap") @Nullable DataSetPhysicalTableMap physicalTableMap,
        @OutputCustomType.Parameter("rowLevelPermissionDataSet") @Nullable DataSetRowLevelPermissionDataSet rowLevelPermissionDataSet,
        @OutputCustomType.Parameter("tags") @Nullable List<DataSetTag> tags) {
        this.arn = arn;
        this.columnGroups = columnGroups;
        this.columnLevelPermissionRules = columnLevelPermissionRules;
        this.consumedSpiceCapacityInBytes = consumedSpiceCapacityInBytes;
        this.createdTime = createdTime;
        this.importMode = importMode;
        this.lastUpdatedTime = lastUpdatedTime;
        this.logicalTableMap = logicalTableMap;
        this.name = name;
        this.outputColumns = outputColumns;
        this.permissions = permissions;
        this.physicalTableMap = physicalTableMap;
        this.rowLevelPermissionDataSet = rowLevelPermissionDataSet;
        this.tags = tags;
    }

    /**
     * <p>The Amazon Resource Name (ARN) of the resource.</p>
     * 
    */
    public Optional<String> getArn() {
        return Optional.ofNullable(this.arn);
    }
    /**
     * <p>Groupings of columns that work together in certain QuickSight features. Currently, only geospatial hierarchy is supported.</p>
     * 
    */
    public List<DataSetColumnGroup> getColumnGroups() {
        return this.columnGroups == null ? List.of() : this.columnGroups;
    }
    public List<DataSetColumnLevelPermissionRule> getColumnLevelPermissionRules() {
        return this.columnLevelPermissionRules == null ? List.of() : this.columnLevelPermissionRules;
    }
    /**
     * <p>The amount of SPICE capacity used by this dataset. This is 0 if the dataset isn't
     *             imported into SPICE.</p>
     * 
    */
    public Optional<Double> getConsumedSpiceCapacityInBytes() {
        return Optional.ofNullable(this.consumedSpiceCapacityInBytes);
    }
    /**
     * <p>The time that this dataset was created.</p>
     * 
    */
    public Optional<String> getCreatedTime() {
        return Optional.ofNullable(this.createdTime);
    }
    public Optional<DataSetImportMode> getImportMode() {
        return Optional.ofNullable(this.importMode);
    }
    /**
     * <p>The last time that this dataset was updated.</p>
     * 
    */
    public Optional<String> getLastUpdatedTime() {
        return Optional.ofNullable(this.lastUpdatedTime);
    }
    public Optional<DataSetLogicalTableMap> getLogicalTableMap() {
        return Optional.ofNullable(this.logicalTableMap);
    }
    /**
     * <p>The display name for the dataset.</p>
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * <p>The list of columns after all transforms. These columns are available in templates,
     *             analyses, and dashboards.</p>
     * 
    */
    public List<DataSetOutputColumn> getOutputColumns() {
        return this.outputColumns == null ? List.of() : this.outputColumns;
    }
    /**
     * <p>A list of resource permissions on the dataset.</p>
     * 
    */
    public List<DataSetResourcePermission> getPermissions() {
        return this.permissions == null ? List.of() : this.permissions;
    }
    public Optional<DataSetPhysicalTableMap> getPhysicalTableMap() {
        return Optional.ofNullable(this.physicalTableMap);
    }
    public Optional<DataSetRowLevelPermissionDataSet> getRowLevelPermissionDataSet() {
        return Optional.ofNullable(this.rowLevelPermissionDataSet);
    }
    /**
     * <p>Contains a map of the key-value pairs for the resource tag or tags assigned to the dataset.</p>
     * 
    */
    public List<DataSetTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDataSetResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable List<DataSetColumnGroup> columnGroups;
        private @Nullable List<DataSetColumnLevelPermissionRule> columnLevelPermissionRules;
        private @Nullable Double consumedSpiceCapacityInBytes;
        private @Nullable String createdTime;
        private @Nullable DataSetImportMode importMode;
        private @Nullable String lastUpdatedTime;
        private @Nullable DataSetLogicalTableMap logicalTableMap;
        private @Nullable String name;
        private @Nullable List<DataSetOutputColumn> outputColumns;
        private @Nullable List<DataSetResourcePermission> permissions;
        private @Nullable DataSetPhysicalTableMap physicalTableMap;
        private @Nullable DataSetRowLevelPermissionDataSet rowLevelPermissionDataSet;
        private @Nullable List<DataSetTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDataSetResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.columnGroups = defaults.columnGroups;
    	      this.columnLevelPermissionRules = defaults.columnLevelPermissionRules;
    	      this.consumedSpiceCapacityInBytes = defaults.consumedSpiceCapacityInBytes;
    	      this.createdTime = defaults.createdTime;
    	      this.importMode = defaults.importMode;
    	      this.lastUpdatedTime = defaults.lastUpdatedTime;
    	      this.logicalTableMap = defaults.logicalTableMap;
    	      this.name = defaults.name;
    	      this.outputColumns = defaults.outputColumns;
    	      this.permissions = defaults.permissions;
    	      this.physicalTableMap = defaults.physicalTableMap;
    	      this.rowLevelPermissionDataSet = defaults.rowLevelPermissionDataSet;
    	      this.tags = defaults.tags;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }

        public Builder columnGroups(@Nullable List<DataSetColumnGroup> columnGroups) {
            this.columnGroups = columnGroups;
            return this;
        }

        public Builder columnLevelPermissionRules(@Nullable List<DataSetColumnLevelPermissionRule> columnLevelPermissionRules) {
            this.columnLevelPermissionRules = columnLevelPermissionRules;
            return this;
        }

        public Builder consumedSpiceCapacityInBytes(@Nullable Double consumedSpiceCapacityInBytes) {
            this.consumedSpiceCapacityInBytes = consumedSpiceCapacityInBytes;
            return this;
        }

        public Builder createdTime(@Nullable String createdTime) {
            this.createdTime = createdTime;
            return this;
        }

        public Builder importMode(@Nullable DataSetImportMode importMode) {
            this.importMode = importMode;
            return this;
        }

        public Builder lastUpdatedTime(@Nullable String lastUpdatedTime) {
            this.lastUpdatedTime = lastUpdatedTime;
            return this;
        }

        public Builder logicalTableMap(@Nullable DataSetLogicalTableMap logicalTableMap) {
            this.logicalTableMap = logicalTableMap;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder outputColumns(@Nullable List<DataSetOutputColumn> outputColumns) {
            this.outputColumns = outputColumns;
            return this;
        }

        public Builder permissions(@Nullable List<DataSetResourcePermission> permissions) {
            this.permissions = permissions;
            return this;
        }

        public Builder physicalTableMap(@Nullable DataSetPhysicalTableMap physicalTableMap) {
            this.physicalTableMap = physicalTableMap;
            return this;
        }

        public Builder rowLevelPermissionDataSet(@Nullable DataSetRowLevelPermissionDataSet rowLevelPermissionDataSet) {
            this.rowLevelPermissionDataSet = rowLevelPermissionDataSet;
            return this;
        }

        public Builder tags(@Nullable List<DataSetTag> tags) {
            this.tags = tags;
            return this;
        }
        public GetDataSetResult build() {
            return new GetDataSetResult(arn, columnGroups, columnLevelPermissionRules, consumedSpiceCapacityInBytes, createdTime, importMode, lastUpdatedTime, logicalTableMap, name, outputColumns, permissions, physicalTableMap, rowLevelPermissionDataSet, tags);
        }
    }
}
