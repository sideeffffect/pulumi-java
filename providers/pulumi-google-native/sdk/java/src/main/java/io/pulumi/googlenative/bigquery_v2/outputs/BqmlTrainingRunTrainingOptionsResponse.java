// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigquery_v2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class BqmlTrainingRunTrainingOptionsResponse {
    private final Boolean earlyStop;
    private final Double l1Reg;
    private final Double l2Reg;
    private final Double learnRate;
    private final String learnRateStrategy;
    private final Double lineSearchInitLearnRate;
    private final String maxIteration;
    private final Double minRelProgress;
    private final Boolean warmStart;

    @OutputCustomType.Constructor
    private BqmlTrainingRunTrainingOptionsResponse(
        @OutputCustomType.Parameter("earlyStop") Boolean earlyStop,
        @OutputCustomType.Parameter("l1Reg") Double l1Reg,
        @OutputCustomType.Parameter("l2Reg") Double l2Reg,
        @OutputCustomType.Parameter("learnRate") Double learnRate,
        @OutputCustomType.Parameter("learnRateStrategy") String learnRateStrategy,
        @OutputCustomType.Parameter("lineSearchInitLearnRate") Double lineSearchInitLearnRate,
        @OutputCustomType.Parameter("maxIteration") String maxIteration,
        @OutputCustomType.Parameter("minRelProgress") Double minRelProgress,
        @OutputCustomType.Parameter("warmStart") Boolean warmStart) {
        this.earlyStop = earlyStop;
        this.l1Reg = l1Reg;
        this.l2Reg = l2Reg;
        this.learnRate = learnRate;
        this.learnRateStrategy = learnRateStrategy;
        this.lineSearchInitLearnRate = lineSearchInitLearnRate;
        this.maxIteration = maxIteration;
        this.minRelProgress = minRelProgress;
        this.warmStart = warmStart;
    }

    public Boolean getEarlyStop() {
        return this.earlyStop;
    }
    public Double getL1Reg() {
        return this.l1Reg;
    }
    public Double getL2Reg() {
        return this.l2Reg;
    }
    public Double getLearnRate() {
        return this.learnRate;
    }
    public String getLearnRateStrategy() {
        return this.learnRateStrategy;
    }
    public Double getLineSearchInitLearnRate() {
        return this.lineSearchInitLearnRate;
    }
    public String getMaxIteration() {
        return this.maxIteration;
    }
    public Double getMinRelProgress() {
        return this.minRelProgress;
    }
    public Boolean getWarmStart() {
        return this.warmStart;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BqmlTrainingRunTrainingOptionsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean earlyStop;
        private Double l1Reg;
        private Double l2Reg;
        private Double learnRate;
        private String learnRateStrategy;
        private Double lineSearchInitLearnRate;
        private String maxIteration;
        private Double minRelProgress;
        private Boolean warmStart;

        public Builder() {
    	      // Empty
        }

        public Builder(BqmlTrainingRunTrainingOptionsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.earlyStop = defaults.earlyStop;
    	      this.l1Reg = defaults.l1Reg;
    	      this.l2Reg = defaults.l2Reg;
    	      this.learnRate = defaults.learnRate;
    	      this.learnRateStrategy = defaults.learnRateStrategy;
    	      this.lineSearchInitLearnRate = defaults.lineSearchInitLearnRate;
    	      this.maxIteration = defaults.maxIteration;
    	      this.minRelProgress = defaults.minRelProgress;
    	      this.warmStart = defaults.warmStart;
        }

        public Builder earlyStop(Boolean earlyStop) {
            this.earlyStop = Objects.requireNonNull(earlyStop);
            return this;
        }

        public Builder l1Reg(Double l1Reg) {
            this.l1Reg = Objects.requireNonNull(l1Reg);
            return this;
        }

        public Builder l2Reg(Double l2Reg) {
            this.l2Reg = Objects.requireNonNull(l2Reg);
            return this;
        }

        public Builder learnRate(Double learnRate) {
            this.learnRate = Objects.requireNonNull(learnRate);
            return this;
        }

        public Builder learnRateStrategy(String learnRateStrategy) {
            this.learnRateStrategy = Objects.requireNonNull(learnRateStrategy);
            return this;
        }

        public Builder lineSearchInitLearnRate(Double lineSearchInitLearnRate) {
            this.lineSearchInitLearnRate = Objects.requireNonNull(lineSearchInitLearnRate);
            return this;
        }

        public Builder maxIteration(String maxIteration) {
            this.maxIteration = Objects.requireNonNull(maxIteration);
            return this;
        }

        public Builder minRelProgress(Double minRelProgress) {
            this.minRelProgress = Objects.requireNonNull(minRelProgress);
            return this;
        }

        public Builder warmStart(Boolean warmStart) {
            this.warmStart = Objects.requireNonNull(warmStart);
            return this;
        }
        public BqmlTrainingRunTrainingOptionsResponse build() {
            return new BqmlTrainingRunTrainingOptionsResponse(earlyStop, l1Reg, l2Reg, learnRate, learnRateStrategy, lineSearchInitLearnRate, maxIteration, minRelProgress, warmStart);
        }
    }
}
