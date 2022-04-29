// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.quicksight.inputs;

import com.pulumi.awsnative.quicksight.inputs.DataSetGeoSpatialColumnGroupArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * &lt;p&gt;Groupings of columns that work together in certain Amazon QuickSight features. This is
 *             a variant type structure. For this structure to be valid, only one of the attributes can
 *             be non-null.&lt;/p&gt;
 * 
 */
public final class DataSetColumnGroupArgs extends ResourceArgs {

    public static final DataSetColumnGroupArgs Empty = new DataSetColumnGroupArgs();

    @Import(name="geoSpatialColumnGroup")
    private @Nullable Output<DataSetGeoSpatialColumnGroupArgs> geoSpatialColumnGroup;

    public Optional<Output<DataSetGeoSpatialColumnGroupArgs>> geoSpatialColumnGroup() {
        return Optional.ofNullable(this.geoSpatialColumnGroup);
    }

    private DataSetColumnGroupArgs() {}

    private DataSetColumnGroupArgs(DataSetColumnGroupArgs $) {
        this.geoSpatialColumnGroup = $.geoSpatialColumnGroup;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DataSetColumnGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataSetColumnGroupArgs $;

        public Builder() {
            $ = new DataSetColumnGroupArgs();
        }

        public Builder(DataSetColumnGroupArgs defaults) {
            $ = new DataSetColumnGroupArgs(Objects.requireNonNull(defaults));
        }

        public Builder geoSpatialColumnGroup(@Nullable Output<DataSetGeoSpatialColumnGroupArgs> geoSpatialColumnGroup) {
            $.geoSpatialColumnGroup = geoSpatialColumnGroup;
            return this;
        }

        public Builder geoSpatialColumnGroup(DataSetGeoSpatialColumnGroupArgs geoSpatialColumnGroup) {
            return geoSpatialColumnGroup(Output.of(geoSpatialColumnGroup));
        }

        public DataSetColumnGroupArgs build() {
            return $;
        }
    }

}
