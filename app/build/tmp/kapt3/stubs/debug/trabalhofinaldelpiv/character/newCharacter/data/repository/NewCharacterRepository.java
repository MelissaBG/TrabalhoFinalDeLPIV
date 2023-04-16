package trabalhofinaldelpiv.character.newCharacter.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J%\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f2\u0006\u0010\u0012\u001a\u00020\u0013H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\u000b\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0015"}, d2 = {"Ltrabalhofinaldelpiv/character/newCharacter/data/repository/NewCharacterRepository;", "", "()V", "localDatasource", "Ltrabalhofinaldelpiv/login/login/data/LoginLocalDataSource;", "getLocalDatasource", "()Ltrabalhofinaldelpiv/login/login/data/LoginLocalDataSource;", "localDatasource$delegate", "Lkotlin/Lazy;", "remoteCharacterDatasource", "Ltrabalhofinaldelpiv/character/newCharacter/data/NewCharacterRemoteDataSource;", "getRemoteCharacterDatasource", "()Ltrabalhofinaldelpiv/character/newCharacter/data/NewCharacterRemoteDataSource;", "remoteCharacterDatasource$delegate", "saveCharacter", "Ltrabalhofinaldelpiv/webservice/Result;", "", "Ltrabalhofinaldelpiv/character/newCharacter/domain/ErrorModelCharacter;", "characterRequest", "Ltrabalhofinaldelpiv/character/newCharacter/data/CharacterRequest;", "(Ltrabalhofinaldelpiv/character/newCharacter/data/CharacterRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class NewCharacterRepository {
    private final kotlin.Lazy remoteCharacterDatasource$delegate = null;
    private final kotlin.Lazy localDatasource$delegate = null;
    
    public NewCharacterRepository() {
        super();
    }
    
    private final trabalhofinaldelpiv.character.newCharacter.data.NewCharacterRemoteDataSource getRemoteCharacterDatasource() {
        return null;
    }
    
    private final trabalhofinaldelpiv.login.login.data.LoginLocalDataSource getLocalDatasource() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object saveCharacter(@org.jetbrains.annotations.NotNull()
    trabalhofinaldelpiv.character.newCharacter.data.CharacterRequest characterRequest, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super trabalhofinaldelpiv.webservice.Result<kotlin.Unit, ? extends trabalhofinaldelpiv.character.newCharacter.domain.ErrorModelCharacter>> continuation) {
        return null;
    }
}