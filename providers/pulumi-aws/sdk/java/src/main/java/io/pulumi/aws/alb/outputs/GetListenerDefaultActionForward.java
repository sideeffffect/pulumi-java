// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.alb.outputs;

import io.pulumi.aws.alb.outputs.GetListenerDefaultActionForwardStickiness;
import io.pulumi.aws.alb.outputs.GetListenerDefaultActionForwardTargetGroup;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetListenerDefaultActionForward {
    private final List<GetListenerDefaultActionForwardStickiness> stickinesses;
    private final List<GetListenerDefaultActionForwardTargetGroup> targetGroups;

    @OutputCustomType.Constructor
    private GetListenerDefaultActionForward(
        @OutputCustomType.Parameter("stickinesses") List<GetListenerDefaultActionForwardStickiness> stickinesses,
        @OutputCustomType.Parameter("targetGroups") List<GetListenerDefaultActionForwardTargetGroup> targetGroups) {
        this.stickinesses = stickinesses;
        this.targetGroups = targetGroups;
    }

    public List<GetListenerDefaultActionForwardStickiness> getStickinesses() {
        return this.stickinesses;
    }
    public List<GetListenerDefaultActionForwardTargetGroup> getTargetGroups() {
        return this.targetGroups;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetListenerDefaultActionForward defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetListenerDefaultActionForwardStickiness> stickinesses;
        private List<GetListenerDefaultActionForwardTargetGroup> targetGroups;

        public Builder() {
    	      // Empty
        }

        public Builder(GetListenerDefaultActionForward defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.stickinesses = defaults.stickinesses;
    	      this.targetGroups = defaults.targetGroups;
        }

        public Builder stickinesses(List<GetListenerDefaultActionForwardStickiness> stickinesses) {
            this.stickinesses = Objects.requireNonNull(stickinesses);
            return this;
        }

        public Builder targetGroups(List<GetListenerDefaultActionForwardTargetGroup> targetGroups) {
            this.targetGroups = Objects.requireNonNull(targetGroups);
            return this;
        }
        public GetListenerDefaultActionForward build() {
            return new GetListenerDefaultActionForward(stickinesses, targetGroups);
        }
    }
}
