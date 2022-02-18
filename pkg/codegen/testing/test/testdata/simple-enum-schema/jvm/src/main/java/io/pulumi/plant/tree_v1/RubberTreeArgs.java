// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.plant.tree_v1;

import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.plant.inputs.ContainerArgs;
import io.pulumi.plant.tree_v1.enums.Diameter;
import io.pulumi.plant.tree_v1.enums.Farm;
import io.pulumi.plant.tree_v1.enums.RubberTreeVariety;
import io.pulumi.plant.tree_v1.enums.TreeSize;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RubberTreeArgs extends io.pulumi.resources.ResourceArgs {

    public static final RubberTreeArgs Empty = new RubberTreeArgs();

    @InputImport(name="container")
    private final @Nullable Input<ContainerArgs> container;

    public Input<ContainerArgs> getContainer() {
        return this.container == null ? Input.empty() : this.container;
    }

    @InputImport(name="diameter", required=true)
    private final Input<Diameter> diameter;

    public Input<Diameter> getDiameter() {
        return this.diameter;
    }

    @InputImport(name="farm")
    private final @Nullable Input<Either<Farm,String>> farm;

    public Input<Either<Farm,String>> getFarm() {
        return this.farm == null ? Input.empty() : this.farm;
    }

    @InputImport(name="size")
    private final @Nullable Input<TreeSize> size;

    public Input<TreeSize> getSize() {
        return this.size == null ? Input.empty() : this.size;
    }

    @InputImport(name="type", required=true)
    private final Input<RubberTreeVariety> type;

    public Input<RubberTreeVariety> getType() {
        return this.type;
    }

    public RubberTreeArgs(
        @Nullable Input<ContainerArgs> container,
        Input<Diameter> diameter,
        @Nullable Input<Either<Farm,String>> farm,
        @Nullable Input<TreeSize> size,
        Input<RubberTreeVariety> type) {
        this.container = container;
        this.diameter = diameter == null ? Input.ofNullable(io.pulumi.plant.tree_v1.enums.Diameter.Sixinch) : Objects.requireNonNull(diameter, "expected parameter 'diameter' to be non-null");
        this.farm = farm == null ? Input.ofRight("(unknown)") : farm;
        this.size = size == null ? Input.ofNullable(io.pulumi.plant.tree_v1.enums.TreeSize.Medium) : size;
        this.type = type == null ? Input.ofNullable(io.pulumi.plant.tree_v1.enums.RubberTreeVariety.Burgundy) : Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private RubberTreeArgs() {
        this.container = Input.empty();
        this.diameter = Input.empty();
        this.farm = Input.empty();
        this.size = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RubberTreeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ContainerArgs> container;
        private Input<Diameter> diameter;
        private @Nullable Input<Either<Farm,String>> farm;
        private @Nullable Input<TreeSize> size;
        private Input<RubberTreeVariety> type;

        public Builder() {
    	      // Empty
        }

        public Builder(RubberTreeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.container = defaults.container;
    	      this.diameter = defaults.diameter;
    	      this.farm = defaults.farm;
    	      this.size = defaults.size;
    	      this.type = defaults.type;
        }

        public Builder setContainer(@Nullable Input<ContainerArgs> container) {
            this.container = container;
            return this;
        }

        public Builder setContainer(@Nullable ContainerArgs container) {
            this.container = Input.ofNullable(container);
            return this;
        }

        public Builder setDiameter(Input<Diameter> diameter) {
            this.diameter = Objects.requireNonNull(diameter);
            return this;
        }

        public Builder setDiameter(Diameter diameter) {
            this.diameter = Input.of(Objects.requireNonNull(diameter));
            return this;
        }

        public Builder setFarm(@Nullable Input<Either<Farm,String>> farm) {
            this.farm = farm;
            return this;
        }

        public Builder setFarm(@Nullable Either<Farm,String> farm) {
            this.farm = Input.ofNullable(farm);
            return this;
        }

        public Builder setSize(@Nullable Input<TreeSize> size) {
            this.size = size;
            return this;
        }

        public Builder setSize(@Nullable TreeSize size) {
            this.size = Input.ofNullable(size);
            return this;
        }

        public Builder setType(Input<RubberTreeVariety> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(RubberTreeVariety type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }

        public RubberTreeArgs build() {
            return new RubberTreeArgs(container, diameter, farm, size, type);
        }
    }
}
