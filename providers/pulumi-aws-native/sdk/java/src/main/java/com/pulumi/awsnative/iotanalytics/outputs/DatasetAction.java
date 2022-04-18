// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iotanalytics.outputs;

import com.pulumi.awsnative.iotanalytics.outputs.DatasetContainerAction;
import com.pulumi.awsnative.iotanalytics.outputs.DatasetQueryAction;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DatasetAction {
    private final String actionName;
    private final @Nullable DatasetContainerAction containerAction;
    private final @Nullable DatasetQueryAction queryAction;

    @CustomType.Constructor
    private DatasetAction(
        @CustomType.Parameter("actionName") String actionName,
        @CustomType.Parameter("containerAction") @Nullable DatasetContainerAction containerAction,
        @CustomType.Parameter("queryAction") @Nullable DatasetQueryAction queryAction) {
        this.actionName = actionName;
        this.containerAction = containerAction;
        this.queryAction = queryAction;
    }

    public String actionName() {
        return this.actionName;
    }
    public Optional<DatasetContainerAction> containerAction() {
        return Optional.ofNullable(this.containerAction);
    }
    public Optional<DatasetQueryAction> queryAction() {
        return Optional.ofNullable(this.queryAction);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatasetAction defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String actionName;
        private @Nullable DatasetContainerAction containerAction;
        private @Nullable DatasetQueryAction queryAction;

        public Builder() {
    	      // Empty
        }

        public Builder(DatasetAction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actionName = defaults.actionName;
    	      this.containerAction = defaults.containerAction;
    	      this.queryAction = defaults.queryAction;
        }

        public Builder actionName(String actionName) {
            this.actionName = Objects.requireNonNull(actionName);
            return this;
        }
        public Builder containerAction(@Nullable DatasetContainerAction containerAction) {
            this.containerAction = containerAction;
            return this;
        }
        public Builder queryAction(@Nullable DatasetQueryAction queryAction) {
            this.queryAction = queryAction;
            return this;
        }        public DatasetAction build() {
            return new DatasetAction(actionName, containerAction, queryAction);
        }
    }
}
