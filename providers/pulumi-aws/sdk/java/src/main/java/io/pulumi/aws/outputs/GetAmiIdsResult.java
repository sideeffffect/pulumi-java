// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.outputs;

import io.pulumi.aws.outputs.GetAmiIdsFilter;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetAmiIdsResult {
    private final @Nullable List<String> executableUsers;
    private final @Nullable List<GetAmiIdsFilter> filters;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final List<String> ids;
    private final @Nullable String nameRegex;
    private final List<String> owners;
    private final @Nullable Boolean sortAscending;

    @OutputCustomType.Constructor({"executableUsers","filters","id","ids","nameRegex","owners","sortAscending"})
    private GetAmiIdsResult(
        @Nullable List<String> executableUsers,
        @Nullable List<GetAmiIdsFilter> filters,
        String id,
        List<String> ids,
        @Nullable String nameRegex,
        List<String> owners,
        @Nullable Boolean sortAscending) {
        this.executableUsers = executableUsers;
        this.filters = filters;
        this.id = id;
        this.ids = ids;
        this.nameRegex = nameRegex;
        this.owners = owners;
        this.sortAscending = sortAscending;
    }

    public List<String> getExecutableUsers() {
        return this.executableUsers == null ? List.of() : this.executableUsers;
    }
    public List<GetAmiIdsFilter> getFilters() {
        return this.filters == null ? List.of() : this.filters;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    public List<String> getIds() {
        return this.ids;
    }
    public Optional<String> getNameRegex() {
        return Optional.ofNullable(this.nameRegex);
    }
    public List<String> getOwners() {
        return this.owners;
    }
    public Optional<Boolean> getSortAscending() {
        return Optional.ofNullable(this.sortAscending);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAmiIdsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> executableUsers;
        private @Nullable List<GetAmiIdsFilter> filters;
        private String id;
        private List<String> ids;
        private @Nullable String nameRegex;
        private List<String> owners;
        private @Nullable Boolean sortAscending;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAmiIdsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.executableUsers = defaults.executableUsers;
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.nameRegex = defaults.nameRegex;
    	      this.owners = defaults.owners;
    	      this.sortAscending = defaults.sortAscending;
        }

        public Builder setExecutableUsers(@Nullable List<String> executableUsers) {
            this.executableUsers = executableUsers;
            return this;
        }

        public Builder setFilters(@Nullable List<GetAmiIdsFilter> filters) {
            this.filters = filters;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setIds(List<String> ids) {
            this.ids = Objects.requireNonNull(ids);
            return this;
        }

        public Builder setNameRegex(@Nullable String nameRegex) {
            this.nameRegex = nameRegex;
            return this;
        }

        public Builder setOwners(List<String> owners) {
            this.owners = Objects.requireNonNull(owners);
            return this;
        }

        public Builder setSortAscending(@Nullable Boolean sortAscending) {
            this.sortAscending = sortAscending;
            return this;
        }
        public GetAmiIdsResult build() {
            return new GetAmiIdsResult(executableUsers, filters, id, ids, nameRegex, owners, sortAscending);
        }
    }
}
