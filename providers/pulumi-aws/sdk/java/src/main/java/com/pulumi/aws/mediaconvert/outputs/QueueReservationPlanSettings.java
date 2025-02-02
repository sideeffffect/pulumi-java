// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.mediaconvert.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class QueueReservationPlanSettings {
    /**
     * @return The length of the term of your reserved queue pricing plan commitment. Valid value is `ONE_YEAR`.
     * 
     */
    private final String commitment;
    /**
     * @return Specifies whether the term of your reserved queue pricing plan. Valid values are `AUTO_RENEW` or `EXPIRE`.
     * 
     */
    private final String renewalType;
    /**
     * @return Specifies the number of reserved transcode slots (RTS) for queue.
     * 
     */
    private final Integer reservedSlots;

    @CustomType.Constructor
    private QueueReservationPlanSettings(
        @CustomType.Parameter("commitment") String commitment,
        @CustomType.Parameter("renewalType") String renewalType,
        @CustomType.Parameter("reservedSlots") Integer reservedSlots) {
        this.commitment = commitment;
        this.renewalType = renewalType;
        this.reservedSlots = reservedSlots;
    }

    /**
     * @return The length of the term of your reserved queue pricing plan commitment. Valid value is `ONE_YEAR`.
     * 
     */
    public String commitment() {
        return this.commitment;
    }
    /**
     * @return Specifies whether the term of your reserved queue pricing plan. Valid values are `AUTO_RENEW` or `EXPIRE`.
     * 
     */
    public String renewalType() {
        return this.renewalType;
    }
    /**
     * @return Specifies the number of reserved transcode slots (RTS) for queue.
     * 
     */
    public Integer reservedSlots() {
        return this.reservedSlots;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(QueueReservationPlanSettings defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String commitment;
        private String renewalType;
        private Integer reservedSlots;

        public Builder() {
    	      // Empty
        }

        public Builder(QueueReservationPlanSettings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.commitment = defaults.commitment;
    	      this.renewalType = defaults.renewalType;
    	      this.reservedSlots = defaults.reservedSlots;
        }

        public Builder commitment(String commitment) {
            this.commitment = Objects.requireNonNull(commitment);
            return this;
        }
        public Builder renewalType(String renewalType) {
            this.renewalType = Objects.requireNonNull(renewalType);
            return this;
        }
        public Builder reservedSlots(Integer reservedSlots) {
            this.reservedSlots = Objects.requireNonNull(reservedSlots);
            return this;
        }        public QueueReservationPlanSettings build() {
            return new QueueReservationPlanSettings(commitment, renewalType, reservedSlots);
        }
    }
}
