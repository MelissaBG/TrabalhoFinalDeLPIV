package trabalhofinaldelpiv.profile.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J5\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\u000b\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0017"}, d2 = {"Ltrabalhofinaldelpiv/profile/data/repository/RegisterRepository;", "", "()V", "localDatasource", "Ltrabalhofinaldelpiv/profile/data/RegisterUserLocalDataSource;", "getLocalDatasource", "()Ltrabalhofinaldelpiv/profile/data/RegisterUserLocalDataSource;", "localDatasource$delegate", "Lkotlin/Lazy;", "remoteDatasource", "Ltrabalhofinaldelpiv/profile/data/RegisterUserRemoteDatasSource;", "getRemoteDatasource", "()Ltrabalhofinaldelpiv/profile/data/RegisterUserRemoteDatasSource;", "remoteDatasource$delegate", "saveLogin", "Ltrabalhofinaldelpiv/webservice/Result;", "Ltrabalhofinaldelpiv/database/RegisterResponse;", "Ltrabalhofinaldelpiv/login/login/domain/model/ErrorModel;", "name", "", "email", "password", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class RegisterRepository {
    private final kotlin.Lazy remoteDatasource$delegate = null;
    private final kotlin.Lazy localDatasource$delegate = null;
    
    public RegisterRepository() {
        super();
    }
    
    private final trabalhofinaldelpiv.profile.data.RegisterUserRemoteDatasSource getRemoteDatasource() {
        return null;
    }
    
    private final trabalhofinaldelpiv.profile.data.RegisterUserLocalDataSource getLocalDatasource() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object saveLogin(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String password, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super trabalhofinaldelpiv.webservice.Result<trabalhofinaldelpiv.database.RegisterResponse, ? extends trabalhofinaldelpiv.login.login.domain.model.ErrorModel>> continuation) {
        return null;
    }
}