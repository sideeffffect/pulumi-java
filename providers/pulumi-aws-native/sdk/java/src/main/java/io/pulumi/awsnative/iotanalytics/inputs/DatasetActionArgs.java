// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotanalytics.inputs;

import io.pulumi.awsnative.iotanalytics.inputs.DatasetContainerActionArgs;
import io.pulumi.awsnative.iotanalytics.inputs.DatasetQueryActionArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DatasetActionArgs extends io.pulumi.resources.ResourceArgs {

    public static final DatasetActionArgs Empty = new DatasetActionArgs();

    @InputImport(name="actionName", required=true)
      private final Input<String> actionName;

    public Input<String> getActionName() {
        return this.actionName;
    }

    @InputImport(name="containerAction")
      private final @Nullable Input<DatasetContainerActionArgs> containerAction;

    public Input<DatasetContainerActionArgs> getContainerAction() {
        return this.containerAction == null ? Input.empty() : this.containerAction;
    }

    @InputImport(name="queryAction")
      private final @Nullable Input<DatasetQueryActionArgs> queryAction;

    public Input<DatasetQueryActionArgs> getQueryAction() {
        return this.queryAction == null ? Input.empty() : this.queryAction;
    }

    public DatasetActionArgs(
        Input<String> actionName,
        @Nullable Input<DatasetContainerActionArgs> containerAction,
        @Nullable Input<DatasetQueryActionArgs> queryAction) {
        this.actionName = Objects.requireNonNull(actionName, "expected parameter 'actionName' to be non-null");
        this.containerAction = containerAction;
        this.queryAction = queryAction;
    }

    private DatasetActionArgs() {
        this.actionName = Input.empty();
        this.containerAction = Input.empty();
        this.queryAction = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatasetActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> actionName;
        private @Nullable Input<DatasetContainerActionArgs> containerAction;
        private @Nullable Input<DatasetQueryActionArgs> queryAction;

        public Builder() {
    	      // Empty
        }

        public Builder(DatasetActionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actionName = defaults.actionName;
    	      this.containerAction = defaults.containerAction;
    	      this.queryAction = defaults.queryAction;
        }

        public Builder actionName(Input<String> actionName) {
            this.actionName = Objects.requireNonNull(actionName);
            return this;
        }

        public Builder actionName(String actionName) {
            this.actionName = Input.of(Objects.requireNonNull(actionName));
            return this;
        }

        public Builder containerAction(@Nullable Input<DatasetContainerActionArgs> containerAction) {
            this.containerAction = containerAction;
            return this;
        }

        public Builder containerAction(@Nullable DatasetContainerActionArgs containerAction) {
            this.containerAction = Input.ofNullable(containerAction);
            return this;
        }

        public Builder queryAction(@Nullable Input<DatasetQueryActionArgs> queryAction) {
            this.queryAction = queryAction;
            return this;
        }

        public Builder queryAction(@Nullable DatasetQueryActionArgs queryAction) {
            this.queryAction = Input.ofNullable(queryAction);
            return this;
        }
        public DatasetActionArgs build() {
            return new DatasetActionArgs(actionName, containerAction, queryAction);
        }
    }
}
