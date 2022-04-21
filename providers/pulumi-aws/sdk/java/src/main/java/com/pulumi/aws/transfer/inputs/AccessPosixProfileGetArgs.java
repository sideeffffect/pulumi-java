// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.transfer.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AccessPosixProfileGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final AccessPosixProfileGetArgs Empty = new AccessPosixProfileGetArgs();

    /**
     * The POSIX group ID used for all EFS operations by this user.
     * 
     */
    @Import(name="gid", required=true)
    private Output<Integer> gid;

    public Output<Integer> gid() {
        return this.gid;
    }

    /**
     * The secondary POSIX group IDs used for all EFS operations by this user.
     * 
     */
    @Import(name="secondaryGids")
    private @Nullable Output<List<Integer>> secondaryGids;

    public Optional<Output<List<Integer>>> secondaryGids() {
        return Optional.ofNullable(this.secondaryGids);
    }

    /**
     * The POSIX user ID used for all EFS operations by this user.
     * 
     */
    @Import(name="uid", required=true)
    private Output<Integer> uid;

    public Output<Integer> uid() {
        return this.uid;
    }

    private AccessPosixProfileGetArgs() {}

    private AccessPosixProfileGetArgs(AccessPosixProfileGetArgs $) {
        this.gid = $.gid;
        this.secondaryGids = $.secondaryGids;
        this.uid = $.uid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AccessPosixProfileGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccessPosixProfileGetArgs $;

        public Builder() {
            $ = new AccessPosixProfileGetArgs();
        }

        public Builder(AccessPosixProfileGetArgs defaults) {
            $ = new AccessPosixProfileGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder gid(Output<Integer> gid) {
            $.gid = gid;
            return this;
        }

        public Builder gid(Integer gid) {
            return gid(Output.of(gid));
        }

        public Builder secondaryGids(@Nullable Output<List<Integer>> secondaryGids) {
            $.secondaryGids = secondaryGids;
            return this;
        }

        public Builder secondaryGids(List<Integer> secondaryGids) {
            return secondaryGids(Output.of(secondaryGids));
        }

        public Builder secondaryGids(Integer... secondaryGids) {
            return secondaryGids(List.of(secondaryGids));
        }

        public Builder uid(Output<Integer> uid) {
            $.uid = uid;
            return this;
        }

        public Builder uid(Integer uid) {
            return uid(Output.of(uid));
        }

        public AccessPosixProfileGetArgs build() {
            $.gid = Objects.requireNonNull($.gid, "expected parameter 'gid' to be non-null");
            $.uid = Objects.requireNonNull($.uid, "expected parameter 'uid' to be non-null");
            return $;
        }
    }

}
