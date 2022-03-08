// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetInstanceTypeInstanceDisk {
    private final Integer count;
    private final Integer size;
    private final String type;

    @OutputCustomType.Constructor({"count","size","type"})
    private GetInstanceTypeInstanceDisk(
        Integer count,
        Integer size,
        String type) {
        this.count = count;
        this.size = size;
        this.type = type;
    }

    public Integer getCount() {
        return this.count;
    }
    public Integer getSize() {
        return this.size;
    }
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceTypeInstanceDisk defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer count;
        private Integer size;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInstanceTypeInstanceDisk defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.count = defaults.count;
    	      this.size = defaults.size;
    	      this.type = defaults.type;
        }

        public Builder setCount(Integer count) {
            this.count = Objects.requireNonNull(count);
            return this;
        }

        public Builder setSize(Integer size) {
            this.size = Objects.requireNonNull(size);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetInstanceTypeInstanceDisk build() {
            return new GetInstanceTypeInstanceDisk(count, size, type);
        }
    }
}
